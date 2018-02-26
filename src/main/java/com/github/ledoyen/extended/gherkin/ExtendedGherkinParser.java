package com.github.ledoyen.extended.gherkin;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtendedGherkinParser {

    private static final String TAG_PREFIX = "@";
    private static final String COMMENT_PREFIX = "#";
    private static final char TABLE_SEPARATOR = '|';
    private static final char NEW_LINE = '\n';

    private static final String LANGUAGE_GROUP_NAME = "language";
    private static final Pattern LANGUAGE_PATTERN = Pattern.compile("^\\s*" + Pattern.quote("language") + "\\s*:\\s*(?<" + LANGUAGE_GROUP_NAME + ">\\S*)\\s*$");
    private static final String TAG_GROUP_NAME = "tag";
    private static final Pattern TAG_PATTERN = Pattern.compile("^(?<" + TAG_GROUP_NAME + ">\\S+)\\s*$");
    private static final String DOC_STRING_SEPARATOR = "\"\"\"";
    private final CharStream charStream;
    private final GherkinKeywordsSupplier keywordsSupplier;

    private final List<ParsingError> errors = new ArrayList<>();
    private String language = null;

    public ExtendedGherkinParser(CharStream charStream) {
        this(charStream, new DefaultGherkinKeywordsSupplier());
    }

    public ExtendedGherkinParser(CharStream charStream, GherkinKeywordsSupplier keywordsSupplier) {
        this.charStream = charStream;
        this.keywordsSupplier = keywordsSupplier;
    }

    public List<ParsingError> getErrors() {
        return errors;
    }

    public Feature feature() {
        ImmutableFeature.Builder builder = ImmutableFeature.builder();
        charStream.skipBlanksAndNewLines();

        featureHeader(builder);
        background(builder);

        return builder.build();
    }

    private void featureHeader(ImmutableFeature.Builder builder) {
        language(builder);

        tags(builder);

        featureLine(builder);

        description(mergeAfterFeatureDescriptionKeywords()).ifPresent(builder::description);
    }

    private void background(ImmutableFeature.Builder builder) {
        Optional<ImmutableFeature.Background.Builder> backgroundBuilder = backgroundLine();
        if(backgroundBuilder.isPresent()) {
            description(mergeStepKeywords()).ifPresent(backgroundBuilder.get()::description);

            steps().forEach(backgroundBuilder.get()::addSteps);

            builder.background(backgroundBuilder.get().build());
        }
    }

    private List<Feature.Step> steps() {
        List<Feature.Step> steps = new ArrayList<>();

        Set<String> stepKeywords = mergeStepKeywords();
        while(charStream.tokensAhead(stepKeywords)) {
            steps.add(step());
        }
        return steps;
    }

    private Feature.Step step() {
        ImmutableFeature.Step.Builder stepBuilder = stepLine();
        Optional<Feature.Datatable> datatable = datatable();
        if (datatable.isPresent()) {
            stepBuilder.datatable(datatable.get());
        } else {
            Optional<Feature.DocString> docString = docString();
            if (docString.isPresent()) {
                stepBuilder.docString(docString.get());
            } else if(charStream.indentAhead()) {
                while(!charStream.dedentAhead()) {
                    stepBuilder.addSubsteps(step());
                }
            }
        }
        return stepBuilder.build();
    }

    private Optional<Feature.DocString> docString() {
        final Optional<Feature.DocString> docString;
        if(charStream.nextIfSpacesTokenAhead(DOC_STRING_SEPARATOR)) {
            Optional<String> contentType = Optional.of(charStream.toEndOfLine().trim()).filter(s -> !s.isEmpty());
            charStream.goToNextLine();
            String text = indentAccordingToFirstLine(charStream.until(DOC_STRING_SEPARATOR));
            docString = Optional.of(ImmutableFeature.DocString.builder().contentType(contentType).text(text).build());
            charStream.nextIfTokenAhead(DOC_STRING_SEPARATOR);
            charStream.skipBlanksAndNewLines();
        } else {
            docString = Optional.empty();
        }
        return docString;
    }

    private String indentAccordingToFirstLine(String text) {
        String[] lines = text.split("\r?\n");
        String firstLine = lines[0];
        int falsyIndent = leftSpaces(firstLine);
        StringBuilder stringBuilder = new StringBuilder(firstLine.substring(falsyIndent));
        for(int lineNumber = 1; lineNumber < lines.length - 1; lineNumber ++) {
            stringBuilder.append('\n').append(lines[lineNumber].substring(falsyIndent));
        }
        return stringBuilder.toString();
    }

    private int leftSpaces(String firstLine) {
        return firstLine.indexOf(firstLine.trim());
    }

    private ImmutableFeature.Step.Builder stepLine() {
        Location location = charStream.location();
        Feature.Keyword keyword = null;
        if(charStream.nextIfAnyTokenAhead(keywordsSupplier.given(language))) {
            keyword = Feature.Keyword.GIVEN;
        } else if(charStream.nextIfAnyTokenAhead(keywordsSupplier.when(language))) {
            keyword = Feature.Keyword.WHEN;
        } else if(charStream.nextIfAnyTokenAhead(keywordsSupplier.then(language))) {
            keyword = Feature.Keyword.THEN;
        } else if(charStream.nextIfAnyTokenAhead(keywordsSupplier.and(language))) {
            keyword = Feature.Keyword.AND;
        } else if(charStream.nextIfAnyTokenAhead(keywordsSupplier.but(language))) {
            keyword = Feature.Keyword.BUT;
        } else {
            // dead code, need refactoring
            errors.add(ParsingError.of(location, "Expecting " + mergeStepKeywords()));
            doThrow();
        }

        String stepName = charStream.toEndOfLine().trim();
        charStream.goToNextLine();

        return ImmutableFeature.Step.builder().keyword(keyword).name(stepName);
    }

    private Optional<Feature.Datatable> datatable() {
        final Optional<Feature.Datatable> datatable;
        if(charStream.spacesAndTokenAhead(TABLE_SEPARATOR)) {
            List<Feature.TableRow> rows = new ArrayList<>();

            Feature.TableRow firstRow = tableRow();
            int expectedRowSize = firstRow.cells().size();
            rows.add(firstRow);
            while (charStream.tokenAhead(TABLE_SEPARATOR)) {
                Location location = charStream.location();
                Feature.TableRow tableRow = tableRow();
                int currentRowSize = tableRow.cells().size();
                if(currentRowSize != expectedRowSize) {
                    errors.add(ParsingError.of(location, "Wrong number of cells, expecting " + expectedRowSize + " cells, found " + currentRowSize));
                }
                rows.add(tableRow);
            }

            datatable = Optional.of(ImmutableFeature.Datatable.builder().addAllRows(rows).build());
        } else {
            datatable = Optional.empty();
        }
        return datatable;
    }

    private Feature.TableRow tableRow() {
        List<String> cells = new ArrayList<>();
        while(charStream.peekChar() != NEW_LINE) {
            charStream.nextChar();
            charStream.skipBlanks();
            String cell = charStream.untilChar(TABLE_SEPARATOR, NEW_LINE);
            if(charStream.peekChar() == TABLE_SEPARATOR) {
                cells.add(cell.trim());
            }
        }
        charStream.skipBlanksAndNewLines();
        return ImmutableFeature.TableRow.builder().addAllCells(cells).build();
    }

    private void language(ImmutableFeature.Builder builder) {
        if (charStream.nextIfTokenAhead(COMMENT_PREFIX)) {
            Location location = charStream.location();
            String line = charStream.toEndOfLine();
            Matcher languageMatcher = LANGUAGE_PATTERN.matcher(line);
            if (languageMatcher.matches()) {
                String language = languageMatcher.group(LANGUAGE_GROUP_NAME);
                if (language.length() == 0) {
                    errors.add(ParsingError.of(location.addColumns(languageMatcher.start(LANGUAGE_GROUP_NAME)), "Missing language name"));
                } else {
                    this.language = language;
                }
                builder.language(language);
            } else {
                errors.add(ParsingError.of(location, "Expecting 'language:'"));
            }
            charStream.skipBlanksAndNewLines();
        }
    }

    private void tags(ImmutableFeature.Builder builder) {
        boolean tagLine = charStream.nextIfTokenAhead(TAG_PREFIX);
        while (tagLine) {
            Location location = charStream.location();
            String line = charStream.toEndOfLine();
            Matcher tagMatcher = TAG_PATTERN.matcher(line);
            if (tagMatcher.matches()) {
                builder.addTags(tagMatcher.group(TAG_GROUP_NAME));
            } else {
                errors.add(ParsingError.of(location, "Expecting non-whitespace character"));
            }
            charStream.skipBlanksAndNewLines();
            tagLine = charStream.nextIfTokenAhead(TAG_PREFIX);
        }
    }

    private void featureLine(ImmutableFeature.Builder builder) {
        charStream.skipBlanks();
        Location location = charStream.location();
        if (!charStream.nextIfAnyTokenAhead(keywordsSupplier.feature(language))) {
            errors.add(ParsingError.of(location, "Expecting " + keywordsSupplier.feature(language)));
            doThrow();
        }
        charStream.skipBlanks();
        location = charStream.location();
        if (charStream.nextChar() != ':') {
            errors.add(ParsingError.of(location, "Expecting ':'"));
            doThrow();
        }
        charStream.skipBlanks();
        String featureName = charStream.toEndOfLine().trim();
        builder.name(featureName);
        charStream.skipBlanksAndNewLines();
    }

    private Optional<ImmutableFeature.Background.Builder> backgroundLine() {
        if(charStream.nextIfAnyTokenAhead(keywordsSupplier.background(language))) {
            charStream.skipBlanks();
            Location location = charStream.location();
            if (charStream.nextChar() != ':') {
                errors.add(ParsingError.of(location, "Expecting ':'"));
                doThrow();
            }
            charStream.skipBlanks();
            String backgroundName = charStream.toEndOfLine().trim();
            charStream.skipBlanksAndNewLines();
            return Optional.of(ImmutableFeature.Background.builder().name(backgroundName));
        }

        return Optional.empty();
    }

    private Optional<String> description(Set<String> afterDescriptionKeywords) {
        StringBuilder descriptionBuilder = new StringBuilder();
        boolean match = false;
        while(!charStream.tokensAhead(afterDescriptionKeywords) && !charStream.isEOF()) {
            if(!match) {
                match = true;
            } else {
                descriptionBuilder.append(NEW_LINE);
            }
            descriptionBuilder.append(charStream.toEndOfLine().trim());
            charStream.skipBlanksAndNewLines();
        }

        final Optional<String> description;
        if(match) {
            description = Optional.of(descriptionBuilder.toString());
            charStream.skipBlanksAndNewLines();
        } else {
            description = Optional.empty();
        }
        return description;
    }

    private Set<String> mergeAfterFeatureDescriptionKeywords() {
        Set<String> afterDescriptionKeywords = new LinkedHashSet<>();
        afterDescriptionKeywords.addAll(keywordsSupplier.background(language));
        afterDescriptionKeywords.add(TAG_PREFIX);
        afterDescriptionKeywords.add(COMMENT_PREFIX);
        afterDescriptionKeywords.addAll(keywordsSupplier.scenarioOutline(language));
        afterDescriptionKeywords.addAll(keywordsSupplier.scenario(language));
        return afterDescriptionKeywords;
    }

    private Set<String> mergeStepKeywords() {
        Set<String> afterDescriptionKeywords = new LinkedHashSet<>();
        afterDescriptionKeywords.addAll(keywordsSupplier.given(language));
        afterDescriptionKeywords.addAll(keywordsSupplier.when(language));
        afterDescriptionKeywords.addAll(keywordsSupplier.then(language));
        afterDescriptionKeywords.addAll(keywordsSupplier.and(language));
        afterDescriptionKeywords.addAll(keywordsSupplier.but(language));
        return afterDescriptionKeywords;
    }

    private void doThrow() {
        throw new ParsingException(errors.get(errors.size() - 1));
    }
}

package com.github.ledoyen.ice.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

public class IceLanguageParser {

    private final Set<String> keywords;

    public IceLanguageParser(Set<String> keywords) {
        this.keywords = keywords;
    }

    public ParsingResult parse(InputStream scenario) {
        Set<ParsingError> errors = new HashSet<>();
        ANTLRErrorListener errorListener = new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                errors.add(ImmutableParsingError.of(ImmutableLocation.of(line, charPositionInLine), msg));
            }
        };

        CharStream charStream = stream(scenario);
        IceLexer lexer = new IceLexer(charStream);
        lexer.getLexerLookup().put(IceLexer.STEP_KEYWORD, keywords);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        IceParser parser = new IceParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        IceParser.DocumentContext result = parser.document();
        if(result.children == null) {
            errors.add(ImmutableParsingError.of(ImmutableLocation.of(1, 0), "Could not parse first line"));
        }
        
        final ParsingResult parsingResult;
        if (errors.isEmpty()) {
            parsingResult = new ParsingResult(buildScenario(result, charStream));
        } else {
            parsingResult = new ParsingResult(errors);
        }

        return parsingResult;
    }

    private Scenario buildScenario(IceParser.DocumentContext result, CharStream charStream) {
        ImmutableScenario.Builder scenarioBuilder = ImmutableScenario.builder();

        scenarioBuilder.location(buildLocation(result));
        result.step().stream().map(stepContext -> buildStep(stepContext, charStream)).forEach(scenarioBuilder::addSteps);

        return scenarioBuilder.build();
    }

    private Scenario.Step buildStep(IceParser.StepContext stepContext, CharStream charStream) {
        ImmutableScenario.Step.Builder stepBuilder = ImmutableScenario.Step.builder();

        stepBuilder.location(buildLocation(stepContext));
        stepBuilder.keyword(stepContext.step_line().STEP_KEYWORD().getText());
        stepBuilder.text(stepContext.step_line().line_to_eol().getText().trim());
        stepContext.LINE_COMMENT().forEach(
                line_comment -> stepBuilder.addComments(stripCommentChar(line_comment.getText()))
        );
        if(stepContext.step_args() != null && stepContext.step_args().doc_string() != null) {
            Interval blocInterval = stepContext.step_args().doc_string().getSourceInterval();
            Interval realInterval = new Interval(blocInterval.a + 12, blocInterval.b + 18);
            String blocText = charStream.getText(realInterval);
            stepBuilder.valueBloc(stripBlocSeperatorAndCorrectIndentation(blocText));
        }

        stepContext.step_args().step().stream().map(subStepContext -> buildStep(subStepContext, charStream)).forEach(stepBuilder::addSteps);

        return stepBuilder.build();
    }

    private String stripBlocSeperatorAndCorrectIndentation(String text) {
        String strippedBlocValue = text.substring(4, text.length() - 4);
        return strippedBlocValue;
    }

    private String stripCommentChar(String text) {
        return text.substring(1).trim();
    }

    private Location buildLocation(ParserRuleContext context) {
        Token start = context.getStart();
        return ImmutableLocation.of(start.getLine(), start.getCharPositionInLine());
    }

    private CharStream stream(InputStream content) {
        try {
            return CharStreams.fromStream(content);
        } catch (IOException e) {
            throw new IllegalStateException("Should not happen", e);
        }
    }
}

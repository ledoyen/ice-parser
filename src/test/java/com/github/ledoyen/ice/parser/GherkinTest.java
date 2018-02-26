package com.github.ledoyen.ice.parser;

import com.google.common.collect.ImmutableSet;
import org.antlr.v4.runtime.*;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public class GherkinTest {

    @Test
    public void gherkin() throws Exception {
        String filename = "sample1.feature";
        InputStream inputStream = GherkinTest.class.getClassLoader().getResourceAsStream(filename);
        CharStream charStream = CharStreams.fromStream(inputStream);

        Set<ParsingError> errors = new HashSet<>();
        ANTLRErrorListener errorListener = new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                errors.add(ImmutableParsingError.of(ImmutableLocation.of(line, charPositionInLine), msg));
            }
        };

        GherkinLexer lexer = new GherkinLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);



        lexer.getAllTokens().forEach(t -> {
            System.out.println(GherkinParser.VOCABULARY.getSymbolicName(t.getType()) + " " + t);
        });

        GherkinParser parser = new GherkinParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        errors.forEach(System.out::println);
        GherkinParser.Gherkin_documentContext gherkin_document = parser.gherkin_document();
        System.out.println(gherkin_document);
        GherkinParser.FeatureContext feature = gherkin_document.feature();
        System.out.println(feature);
        System.out.println(feature.feature_header());
        System.out.println(feature.scenario_definition());
    }
}

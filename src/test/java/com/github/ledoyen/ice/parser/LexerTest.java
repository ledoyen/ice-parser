package com.github.ledoyen.ice.parser;

import com.google.common.collect.Sets;
import org.antlr.v4.runtime.CharStreams;
import org.junit.Test;

import java.io.IOException;

public class LexerTest {

    @Test
    public void one_level() throws IOException {
        String scenarioName = "one_level.ice";
        displayTokens(scenarioName);
    }

    @Test
    public void three_levels() throws IOException {
        String scenarioName = "three_levels.ice";
        displayTokens(scenarioName);
    }

    private void displayTokens(String scenarioName) throws IOException {
        IceLexer lexer = new IceLexer(CharStreams.fromStream(LexerTest.class.getClassLoader().getResourceAsStream(scenarioName)));
        lexer.getLexerLookup().put(IceLexer.STEP_KEYWORD, Sets.newHashSet("Given", "And", "When", "Quand", "Then"));

        lexer.getAllTokens().forEach(t -> {
            System.out.println(IceParser.VOCABULARY.getSymbolicName(t.getType()) + " " + t);
        });
    }
}

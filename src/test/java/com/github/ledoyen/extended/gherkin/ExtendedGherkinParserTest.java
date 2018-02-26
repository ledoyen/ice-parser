package com.github.ledoyen.extended.gherkin;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExtendedGherkinParserTest {

    @Test
    public void standard_feature_parsing() throws Exception {
        String filename = "sample1.feature";
        CharStream charStream = CharStream.from(ExtendedGherkinParser.class.getClassLoader().getResourceAsStream(filename));
        ExtendedGherkinParser extendedGherkinParser = new ExtendedGherkinParser(charStream);

        Feature feature = extendedGherkinParser.feature();

        assertThat(extendedGherkinParser.getErrors()).isEmpty();

        assertThat(feature).isNotNull();
    }

    @Test
    public void full_feature_parsing() throws Exception {
        String content = " # language : fr/Fr\n" +
                "  @lol \n" +
                "@truc\n" +
                "Feature  : a feature  \n" +
                "  some  \n" +
                "  description\n" +
                "  \n" +
                "  Background : a background\n" +
                "    background \n" +
                "    description\n" +
                "    \n" +
                "    Given a global precondition \n" +
                "    | col1 | col2 | col3 |\n" +
                "    | v1   | v2   | v3   |\n" +
                "    And an other global precondition\n" +
                "    \"\"\"test\n" +
                "    multi\n" +
                "      line\n" +
                "    \"\"\"\n" +
                "\n" +
                "  Scenario: first scenario\n";
        CharStream charStream = CharStream.from(content);
        ExtendedGherkinParser extendedGherkinParser = new ExtendedGherkinParser(charStream);

        Feature feature = extendedGherkinParser.feature();

        assertThat(extendedGherkinParser.getErrors()).isEmpty();

        assertThat(feature).isNotNull();

        assertThat(feature.language()).contains("fr/Fr");
        assertThat(feature.tags()).containsExactlyInAnyOrder("lol", "truc");
        assertThat(feature.name()).isEqualTo("a feature");
        assertThat(feature.description()).contains("some\ndescription");
        assertThat(feature.background()).isPresent();
        assertThat(feature.background().get().name()).isEqualTo("a background");
        assertThat(feature.background().get().description()).contains("background\ndescription");
        assertThat(feature.background().get().steps()).hasSize(2);
        assertThat(feature.background().get().steps()).extracting(Feature.Step::keyword).containsExactly(Feature.Keyword.GIVEN, Feature.Keyword.AND);
        assertThat(feature.background().get().steps()).extracting(Feature.Step::name).containsExactly("a global precondition", "an other global precondition");

        assertThat(feature.background().get().steps().get(0).datatable()).isPresent();
        assertThat(feature.background().get().steps().get(0).datatable().get().rows()).hasSize(2);

        assertThat(feature.background().get().steps().get(1).docString()).isPresent();
        assertThat(feature.background().get().steps().get(1).docString().get().contentType()).contains("test");
        assertThat(feature.background().get().steps().get(1).docString().get().text()).contains("multi\n  line");
    }
}
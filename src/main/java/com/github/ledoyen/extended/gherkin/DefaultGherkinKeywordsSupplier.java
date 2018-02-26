package com.github.ledoyen.extended.gherkin;

import java.util.Collections;
import java.util.Set;

class DefaultGherkinKeywordsSupplier implements GherkinKeywordsSupplier {
    @Override
    public Set<String> feature(String language) {
        return Collections.singleton("Feature");
    }

    @Override
    public Set<String> background(String language) {
        return Collections.singleton("Background");
    }

    @Override
    public Set<String> scenarioOutline(String language) {
        return Collections.singleton("Scenario Outline");
    }

    @Override
    public Set<String> scenario(String language) {
        return Collections.singleton("Scenario");
    }

    @Override
    public Set<String> given(String language) {
        return Collections.singleton("Given");
    }

    @Override
    public Set<String> when(String language) {
        return Collections.singleton("When");
    }

    @Override
    public Set<String> then(String language) {
        return Collections.singleton("Then");
    }

    @Override
    public Set<String> and(String language) {
        return Collections.singleton("And");
    }

    @Override
    public Set<String> but(String language) {
        return Collections.singleton("But");
    }
}

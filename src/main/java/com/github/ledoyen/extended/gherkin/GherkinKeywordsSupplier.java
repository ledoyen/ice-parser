package com.github.ledoyen.extended.gherkin;

import java.util.Collection;
import java.util.Set;

public interface GherkinKeywordsSupplier {

    Set<String> feature(String language);

    Set<String> background(String language);

    Set<String> scenarioOutline(String language);

    Set<String> scenario(String language);

    Set<String> given(String language);

    Set<String> when(String language);

    Set<String> then(String language);

    Set<String> and(String language);

    Set<String> but(String language);
}

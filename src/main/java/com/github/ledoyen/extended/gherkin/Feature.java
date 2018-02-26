package com.github.ledoyen.extended.gherkin;

import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Value.Immutable
@Value.Enclosing
public interface Feature {
    Optional<String> language();

    Set<String> tags();

    String name();

    Optional<String> description();

    Optional<Background> background();

    enum Keyword {
        GIVEN, WHEN, THEN, AND, BUT;
    }

    @Value.Immutable
    interface Background {

        String name();

        Optional<String> description();

        List<Step> steps();
    }

    @Value.Immutable
    interface Step {

        Keyword keyword();

        String name();

        Optional<Datatable> datatable();

        Optional<DocString> docString();

        List<Step> substeps();
    }

    @Value.Immutable
    interface Datatable {
        List<TableRow> rows();
    }

    @Value.Immutable
    interface TableRow {
        List<String> cells();
    }

    @Value.Immutable
    interface DocString {

        Optional<String> contentType();

        String text();
    }
}

package com.github.ledoyen.ice.parser;

import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@Value.Enclosing
public interface Scenario extends StepContainer, Localizable {

    @Value.Immutable
    interface Step extends StepContainer, Commentable, Localizable {
        String keyword();
        String text();
        Optional<String> valueBloc();
    }
}

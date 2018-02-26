package com.github.ledoyen.extended.gherkin;

import org.immutables.value.Value;

@Value.Immutable
public interface ParsingError {

    @Value.Parameter
    Location location();

    @Value.Parameter
    String message();

    static ParsingError of(Location location, String message) {
        return ImmutableParsingError.of(location, message);
    }
}

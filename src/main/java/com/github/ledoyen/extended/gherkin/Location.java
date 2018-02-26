package com.github.ledoyen.extended.gherkin;

import org.immutables.value.Value;

@Value.Immutable
public interface Location {
    @Value.Parameter
    int line();

    @Value.Parameter
    int charPositionInLine();

    static Location from(MutablePosition mutablePosition) {
        return ImmutableLocation.of(mutablePosition.getLine(), mutablePosition.getColumn());
    }

    default Location addColumns(int columns) {
        return ImmutableLocation.of(line(), charPositionInLine() + columns);
    }
}

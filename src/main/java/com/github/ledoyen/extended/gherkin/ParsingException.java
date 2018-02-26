package com.github.ledoyen.extended.gherkin;

public class ParsingException extends RuntimeException {

    public ParsingException(ParsingError parsingError) {
        super(parsingError.message() + " at " + parsingError.location());
    }
}

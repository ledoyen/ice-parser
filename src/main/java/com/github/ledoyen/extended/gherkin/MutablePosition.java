package com.github.ledoyen.extended.gherkin;

class MutablePosition {
    private int line = 1;
    private int column = 0;
    private int indentLevel = 0;
    private boolean potentialLeadingSpaces = true;

    MutablePosition() {
    }

    @Override
    public String toString() {
        return "[line=" + line +
                ", column=" + column +
                ']';
    }

    char updateFromChar(char c) {
        if (c == '\n') {
            line++;
            column = 0;
            indentLevel = 0;
            potentialLeadingSpaces = true;
        } else {
            column++;
            if(potentialLeadingSpaces && c == ' ') {
                indentLevel++;
            } else if(potentialLeadingSpaces && c == '\t') {
                // TODO parameterize tab to space conversion
                indentLevel = indentLevel + 4;
            } else {
                potentialLeadingSpaces = false;
            }
        }
        return c;
    }

    char[] updateFromChars(char[] chars) {
        for (char c : chars)
            updateFromChar(c);
        return chars;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}

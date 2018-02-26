package com.github.ledoyen.extended.gherkin;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Pattern;

// TODO split in position updating methods and the other ones which use those first ones
public class CharStream {
    private final static Pattern LEFT_TRIM_PATTERN = Pattern.compile("^\\s+");
    private final MutablePosition position = new MutablePosition();
    private final Reader reader;


    public CharStream(Reader reader) {
        if (!reader.markSupported()) {
            throw new IllegalArgumentException("Cannot use reader that does not support marking");
        }
        this.reader = reader;
    }

    public static CharStream from(InputStream inputStream) {
        StringBuilder textBuilder = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            int c = 0;
            while ((c = reader.read()) != -1) {
                textBuilder.append((char) c);
            }
        } catch (IOException e) {
            throw new UncheckedIOException("Unreadable inputStream: " + e.getMessage(), e);
        }
        return from(textBuilder.toString());
    }

    public static CharStream from(String text) {
        return new CharStream(new BufferedReader(new StringReader(text)));
    }

    public Location location() {
        return Location.from(position);
    }

    public boolean isEOF() {
        int nextInt = peekInt();

        return isIntEOF(nextInt);
    }

    private boolean isIntEOF(int nextInt) {
        return nextInt == -1;
    }

    private int peekInt() {
        try {
            reader.mark(1);
            int nextInt = reader.read();
            reader.reset();
            return nextInt;
        } catch (IOException e) {
            throw new UncheckedIOException("Unable to peek nextChar at " + position, e);
        }
    }

    public char peekChar() {
        return (char) peekInt();
    }

    public char nextChar() {
        try {
            return position.updateFromChar((char) reader.read());
        } catch (IOException e) {
            throw new UncheckedIOException("Unable to get nextChar at " + position, e);
        }
    }

    public boolean tokensAhead(Set<String> tokens) {
        return tokens.stream().anyMatch(this::tokenAhead);
    }

    public boolean tokenAhead(String token) {
        return tokenAhead(token, false);
    }

    public boolean nextIfTokenAhead(String token) {
        return tokenAhead(token, true);
    }

    public boolean tokenAhead(char token) {
        return peekChar() == token;
    }

    private boolean tokenAhead(String token, boolean advanceOnMatch) {
        try {
            reader.mark(token.length());
            char[] nextChars = new char[token.length()];
            reader.read(nextChars, 0, token.length());
            String exploration = new String(nextChars);
            boolean tokenAhead = token.equals(exploration);
            if (advanceOnMatch && tokenAhead) {
                reader.mark(0);
                position.updateFromChars(nextChars);
            }
            reader.reset();
            return tokenAhead;
        } catch (IOException e) {
            throw new UncheckedIOException("Unable to look ahead" + token.length() + " chars at " + position, e);
        }
    }

    public boolean spacesAndTokenAhead(char token) {
        return spacesAndTokenAhead(String.valueOf(token), false);
    }

    public boolean nextIfSpacesTokenAhead(String token) {
        return spacesAndTokenAhead(token, true);
    }

    private boolean spacesAndTokenAhead(String token, boolean advanceOnMatch) {
        Predicate<Character> stopCondition = c -> c != ' ' && c != '\t';
        return tokenAhead(until(stopCondition) + token, advanceOnMatch);
    }

    public boolean nextIfAnyTokenAhead(Set<String> tokens) {
        boolean tokenAhead = false;
        for (String token : tokens) {
            tokenAhead = nextIfTokenAhead(token);
            if (tokenAhead) break;
        }
        return tokenAhead;
    }

    public String until(String token) {
        StringBuilder textBuilder = new StringBuilder();
        while (!tokenAhead(token) && !isEOF()) {
            textBuilder.append(nextChar());
        }
        return textBuilder.toString();
    }

    public String toEndOfLine() {
        return until(c -> '\r' == c || '\n' == c);
    }

    public String untilChar(char... tokens) {
        Predicate<Character> stopCondition = c -> {
            boolean stop = false;
            for (char token : tokens) {
                if (token == c) {
                    stop = true;
                    break;
                }
            }
            return stop;
        };
        return until(stopCondition);
    }

    private String until(Predicate<Character> stopCondition) {
        boolean reachTokenOrEndOfFile = false;
        StringBuilder stringBuffer = new StringBuilder();
        while (!reachTokenOrEndOfFile) {
            int nextInt = peekInt();
            if (isIntEOF(nextInt) || stopCondition.test((char) nextInt)) {
                reachTokenOrEndOfFile = true;
            } else {
                stringBuffer.append(nextChar());
            }
        }
        return stringBuffer.toString();
    }

    public boolean goToNextLine() {
        int readAheadLimit = 1;
        try {
            reader.mark(readAheadLimit);
            int nextInt = reader.read();
            boolean reachedNewLine = isIntCarriageReturn(nextInt);
            while (!isIntEOF(nextInt) && !reachedNewLine) {
                reader.reset();
                reader.mark(++readAheadLimit);
                reader.skip(readAheadLimit - 1);
                nextInt = reader.read();
                reachedNewLine = isIntCarriageReturn(nextInt);
            }
            if (reachedNewLine) {
                position.updateFromChar((char) nextInt);
                reader.mark(0);
            }
            reader.reset();
            return reachedNewLine;
        } catch (IOException e) {
            throw new UncheckedIOException("Unable to look ahead next line at " + position, e);
        }
    }

    private boolean isIntCarriageReturn(int nextInt) {
        return nextInt == '\n';
    }

    public CharStream skipBlanksAndNewLines() {
        skip(' ', '\t', '\r', '\n');
        return this;
    }

    public CharStream skipBlanks() {
        skip(' ', '\t', '\r');
        return this;
    }

    private int skip(char... chars) {
        int skippedCharacters = 0;
        int nextInt = peekInt();
        while (match(nextInt, chars)) {
            nextChar();
            skippedCharacters++;
            nextInt = peekInt();
        }
        return skippedCharacters;
    }

    private boolean match(int nextInt, char[] chars) {
        return new String(chars).chars().filter(c -> c == nextInt).findAny().isPresent();
    }

    public boolean indentAhead() {
        return false;
    }

    public boolean dedentAhead() {
        return false;
    }
}

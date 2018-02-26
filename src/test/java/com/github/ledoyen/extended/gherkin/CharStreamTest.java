package com.github.ledoyen.extended.gherkin;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class CharStreamTest {

    @Test
    public void empty_string_state_is_EOF() {
        CharStream charStream = CharStream.from("");
        assertThat(charStream.isEOF()).isTrue();
    }

    @Test
    public void non_mpty_string_state_is_not_EOF() {
        CharStream charStream = CharStream.from(" ");
        assertThat(charStream.isEOF()).isFalse();

        char nextChar = charStream.nextChar();
        assertThat(nextChar).isEqualTo(' ');
        assertThat(charStream.isEOF()).isTrue();
    }

    @Test
    public void nextIfTokenAhead_moves_cursor_matches() {
        CharStream charStream = CharStream.from("Feature: some");
        assertThat(charStream.nextIfTokenAhead("Feature")).isTrue();
        assertThat(charStream.nextIfTokenAhead("Feature")).isFalse();
        assertThat(charStream.nextChar()).isEqualTo(':');
    }

    @Test
    public void toEndOfLine_return_non_EOL_chars() {
        CharStream charStream = CharStream.from("first line\nsecond line\r\nthird line");
        assertThat(charStream.toEndOfLine()).isEqualTo("first line");
        assertThat(charStream.toEndOfLine()).isEqualTo("");
        assertThat(charStream.nextChar()).isEqualTo('\n');
        assertThat(charStream.toEndOfLine()).isEqualTo("second line");
        assertThat(charStream.nextChar()).isEqualTo('\r');
        assertThat(charStream.nextChar()).isEqualTo('\n');
        assertThat(charStream.toEndOfLine()).isEqualTo("third line");
        assertThat(charStream.isEOF()).isTrue();
    }

    @Test
    public void goToNextLine_returns_true_if_line_breaker_found_before_EOF() throws Exception {
        CharStream charStream = CharStream.from("\r\nfirst \n second");
        assertThat(charStream.goToNextLine()).isTrue();
        assertThat(charStream.nextIfTokenAhead("first ")).isTrue();
        assertThat(charStream.goToNextLine()).isTrue();
        assertThat(charStream.nextIfTokenAhead(" second")).isTrue();
        assertThat(charStream.goToNextLine()).isFalse();
    }

    @Test
    public void skipBlanksAndNewLines_skip_spaces_tabs_and_new_line_characters() throws Exception {
        CharStream charStream = CharStream.from("    1  \r\n\t\t  2  \n 3");

        assertThat(charStream.skipBlanksAndNewLines().nextChar()).isEqualTo('1');
        assertThat(charStream.skipBlanksAndNewLines().nextChar()).isEqualTo('2');
        assertThat(charStream.skipBlanksAndNewLines().nextChar()).isEqualTo('3');
    }

    @Test
    public void nextIfAnyTokenAhead_returns_true_when_one_token_matches() {
        CharStream charStream = CharStream.from("1some22some1");

        Set<String> tokens = new LinkedHashSet<>();
        tokens.add("some1");
        tokens.add("some2");
        assertThat(charStream.nextIfAnyTokenAhead(tokens)).isFalse();
        assertThat(charStream.nextChar()).isEqualTo('1');
        assertThat(charStream.nextIfAnyTokenAhead(tokens)).isTrue();
        assertThat(charStream.nextIfAnyTokenAhead(tokens)).isFalse();
        assertThat(charStream.nextChar()).isEqualTo('2');
        assertThat(charStream.nextIfAnyTokenAhead(tokens)).isTrue();
    }

    @Test
    public void tokensAhead_returns_true_only_if_one_token_matches() throws Exception {
        CharStream charStream = CharStream.from("1some22some1");

        Set<String> tokens = new LinkedHashSet<>();
        tokens.add("some1");
        tokens.add("some2");

        assertThat(charStream.tokensAhead(tokens)).isFalse();
        assertThat(charStream.nextChar()).isEqualTo('1');
        assertThat(charStream.tokensAhead(tokens)).isTrue();
        assertThat(charStream.nextIfTokenAhead("some2")).isTrue();
        assertThat(charStream.nextChar()).isEqualTo('2');
    }
}
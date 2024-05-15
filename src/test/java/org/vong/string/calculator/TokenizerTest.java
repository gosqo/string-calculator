package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vong.string.calculator.Fixture.CUSTOM_DELIMITER_INPUT;

class TokenizerTest {
    private Tokenizer tokenizer;

    @BeforeEach
    void assignNewTokenizer() {
        tokenizer = new Tokenizer();
    }

    @Test
    void splitWithDelimiter() {
        assertThat(tokenizer.splitWithDelimiter(";", CUSTOM_DELIMITER_INPUT)).isEqualTo(new String[]{"1", "2", "3"});
    }
}
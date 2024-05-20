package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vong.string.calculator.Fixture.TWO_DIGITS;

class TokenizerTest {

    private Tokenizer tokenizer;

    @BeforeEach
    void setUp() {
        tokenizer = new Tokenizer();
    }

    @Test
    void tokenize() {
        List<String> list = tokenizer.tokenize(TWO_DIGITS);
        System.out.println(TWO_DIGITS + " tokenized: " + list);

        assertThat(list).isEqualTo(Arrays.asList("11", "+", "22", "+", "33", "+", "44", "-", "44"));
    }
}
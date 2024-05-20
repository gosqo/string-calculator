package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class OperationTest {
    private Operation operation;
    private final Tokenizer tokenizer = new Tokenizer();

    @BeforeEach
    void setUp() {
        operation = new Operation(tokenizer);
    }

    @Test
    void operate() {
        long result = operation.operate(Arrays.asList("11", "+", "22", "+", "33", "-", "33"));
        assertThat(result).isEqualTo(33L);
    }

    @Test
    void operateWithInputs() {
        long result = operation.operate(Fixture.ADDITION);
    }
}

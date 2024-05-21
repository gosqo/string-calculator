package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vong.string.calculator.Fixture.PASS_FLOATING_INPUTS;
import static org.vong.string.calculator.Fixture.PASS_INPUTS;

public class OperationTest {
    private Operation operation;
    private final Tokenizer tokenizer = new Tokenizer();

    @BeforeEach
    void setUp() {
        operation = new Operation(tokenizer);
    }

    @Test
    void operateFloatingInputs() {
        for (String input : PASS_FLOATING_INPUTS) {
            BigDecimal result = operation.operateBigDecimal(input);
            System.out.println(result);
        }
    }

    @Test
    void operate() {
        BigDecimal result = operation.operateBigDecimal(Arrays.asList("11", "+", "22", "+", "33", "-", "33"));
        assertThat(result).isEqualTo(BigDecimal.valueOf(33));
    }

    @Test
    void operateInputs() {
        for (String input : PASS_INPUTS) {
            BigDecimal result = operation.operateBigDecimal(input);
            System.out.println(result);
        }
    }
}

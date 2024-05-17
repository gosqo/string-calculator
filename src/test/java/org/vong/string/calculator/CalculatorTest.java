package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void addPassingInputs() {
        for (String input : Fixture.INPUTS_PASS) {
            calculator.calculate(new VO(input));
        }
    }

    @Test
    void addFailInputs() {
        assertThatThrownBy(() -> {
            for (String input : Fixture.INPUTS_FAIL) {
                calculator.calculate(new VO(input));
            }
        });
    }
}

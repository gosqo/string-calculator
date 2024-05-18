package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        calculator.calculate(new VO(Fixture.ADD));
    }

    @Test
    void subtract() {
        calculator.calculate(new VO(Fixture.SUBTRACT));
    }
}

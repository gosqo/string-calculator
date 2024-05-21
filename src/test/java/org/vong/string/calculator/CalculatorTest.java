package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.vong.string.calculator.Fixture.PASS_FLOATING_INPUTS;

class CalculatorTest {
    private Calculator calculator;
    private final PatternChecker checker = new PatternChecker();
    private final Tokenizer tokenizer = new Tokenizer();
    private final Operation operation = new Operation(tokenizer);

    @BeforeEach
    void setUp() {
        calculator = new Calculator(checker, operation);
    }

    @Test
    void calculateFloatingInputs() {
        Arrays.stream(PASS_FLOATING_INPUTS)
                .forEach(input -> calculator.calculate(input));
    }

    @Test
    void calculate() {
        Stream<String> stream = Arrays.stream(Fixture.PASS_INPUTS);
        stream.forEach(input -> calculator.calculate(input));
    }
}

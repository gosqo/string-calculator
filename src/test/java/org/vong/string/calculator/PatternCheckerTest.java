package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.vong.string.calculator.Fixture.*;

class PatternCheckerTest {
    private PatternChecker checker;

    @BeforeEach
    void assignNewChecker() {
        checker = new PatternChecker();
    }

    @Test
    void checkMultiplication() {
        assertThat(checker.isComputable(MULTIPLICATION)).isTrue();
    }

    @Test
    void checkDivision() {
        assertThat(checker.isComputable(DIVISION)).isTrue();
    }

    @Test
    void passInputs() {
        for (String input : PASS_INPUTS) {
            System.out.println(input);
            assertThat(checker.isComputable((input))).isTrue();
        }
    }

    @Test
    void throwInputs() {
        for (String input : THROW_INPUTS) {
            System.out.println(input);
            assertThatThrownBy(() -> checker.isComputable(input));
        }
    }

    @Test
    void failInputs() {
        for (String input : FAIL_INPUTS) {
            System.out.println(input);
            assertThat(checker.isComputable(input)).isFalse();
        }
    }
}

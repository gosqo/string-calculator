package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vong.string.calculator.Fixture.COLON_DELIMITER;
import static org.vong.string.calculator.Fixture.CUSTOM_DELIMITER;

class PatternCheckerTest {
    private PatternChecker checker;

    @BeforeEach
    void assignNewChecker() {
        checker = new PatternChecker();
    }

    @Test
    void hasCustomDelimiter() {
        assertThat(checker.hasCustomDelimiter(CUSTOM_DELIMITER)).isTrue();
    }

    @Test
    void hasDefaultDelimiter() {
        assertThat(checker.hasDefaultDelimiter(COLON_DELIMITER)).isTrue();
    }

    @Test
    void logCustomDelimiterRegex() {
        System.out.println(CUSTOM_DELIMITER);
        System.out.println(PatternChecker.CUSTOM_DELIMITER_REGEX);
    }
}

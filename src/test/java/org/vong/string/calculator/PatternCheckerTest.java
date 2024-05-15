package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vong.string.calculator.Fixture.*;

class PatternCheckerTest {
    private PatternChecker checker;

    @BeforeEach
    void assignNewChecker() {
        checker = new PatternChecker();
    }

    @Test
    void caseOf() {
        assertThat(checker.caseOf(CUSTOM_DELIMITER_INPUT)).isEqualTo(PatternChecker.CUSTOM_DELIMITER_REGEX);
        assertThat(checker.caseOf(NORMAL_INPUT_COLON)).isEqualTo(PatternChecker.NORMAL_COLON_REGEX);
        assertThat(checker.caseOf(NORMAL_INPUT_COMMA)).isEqualTo(PatternChecker.NORMAL_COMMA_REGEX);
    }

    @Test
    void consistOnlyNumber() {
        assertThat(checker.consistOnlyNumber(new String[]{"1", "2", "d"})).isFalse();
        assertThat(checker.consistOnlyNumber(new String[]{"1", "245", "33"})).isTrue();
    }

    @Test
    void matchesAnyPass() {
        assertThat(Arrays.stream(INPUTS_PASS).allMatch(item -> checker.matchesAny(item))).isTrue();
    }

    @Test
    void matchesAnyFail() {
        assertThat(checker.matchesAny(MIX_NORMAL_DELIMITER_INPUT)).isFalse();
        assertThat(checker.matchesAny(MIX_CUSTOM_DELIMITER_INPUT)).isTrue(); // resolve this case with PatternChecker.consistOnlyNumber().

    }

    @Test
    void hasCustomDelimiter() {
        assertThat(checker.hasCustomDelimiter(CUSTOM_DELIMITER_INPUT)).isTrue();
    }

    @Test
    void delimitWithColon() {
        assertThat(checker.delimitWithColon(NORMAL_INPUT_COLON)).isTrue();
    }

    @Test
    void delimitWithComma() {
        assertThat(checker.delimitWithComma(NORMAL_INPUT_COMMA)).isTrue();
    }

    @Test
    void logCustomDelimiterRegex() {
        System.out.println(CUSTOM_DELIMITER_INPUT);
        System.out.println(PatternChecker.CUSTOM_DELIMITER_REGEX);
    }
}

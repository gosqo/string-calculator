package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PatternCheckerTest {
    private PatternChecker checker;

    @BeforeEach
    void assignNewChecker() {
        checker = new PatternChecker();
    }

    @Test
    void patternCheck() {
        for (String input : Fixture.PASS_INPUTS) {
            System.out.println(input);
            checker.isComputable((input));
        }
    }
}

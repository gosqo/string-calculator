package org.vong.string.calculator;

import java.util.regex.Pattern;

public class PatternChecker {
    public static final String CUSTOM_DELIMITER_REGEX = "^//([\\S\\D])\n(\\d+[,:\\S\\D])*[\\d]$";
    public static final String DEFAULT_DELIMITER_REGEX = "^(\\d+[,:]{1})*[\\d]$";

    private boolean patternMatches(String regex, String input) {
        return Pattern.matches(regex, input);
    }

    public boolean hasCustomDelimiter(String input) {
        return patternMatches(CUSTOM_DELIMITER_REGEX, input);
    }

    public boolean hasDefaultDelimiter(String input) {
        return patternMatches(DEFAULT_DELIMITER_REGEX, input);
    }
}

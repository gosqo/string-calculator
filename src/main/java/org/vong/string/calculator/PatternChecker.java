package org.vong.string.calculator;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternChecker {
    public static final String CUSTOM_DELIMITER_REGEX = "^//[\\S\\D]\n(\\d+[\\S\\D]+)*[\\d]$";
    public static final String NORMAL_COLON_REGEX = "^(\\d+:+)*[\\d]$";
    public static final String NORMAL_COMMA_REGEX = "^(\\d+,+)*[\\d]$";
    public static final String[] PATTERNS = {
            CUSTOM_DELIMITER_REGEX
            , NORMAL_COLON_REGEX
            , NORMAL_COMMA_REGEX
    };
    public static final String ONLY_NUMBERS_REGEX = "^\\d+$";

    public boolean consistOnlyNumber(String[] arr) {
        return Arrays.stream(arr).allMatch(item -> Pattern.matches(ONLY_NUMBERS_REGEX, item));
    }

    public boolean matchesAny(String input) {
        return Arrays.stream(PATTERNS).anyMatch(item -> patternMatches(item, input));
    }

    public String caseOf(String input) {
        for (String pattern : PATTERNS) {
            if (patternMatches(pattern, input)) return pattern;
        }
        throw new StringCalculatorFormatException();
    }

    private boolean patternMatches(String regex, String input) {
        return Pattern.matches(regex, input);
    }

    public boolean hasCustomDelimiter(String input) {
        return patternMatches(CUSTOM_DELIMITER_REGEX, input);
    }

    public boolean delimitWithColon(String input) {
        return patternMatches(NORMAL_COLON_REGEX, input);
    }

    public boolean delimitWithComma(String input) {
        return patternMatches(NORMAL_COMMA_REGEX, input);
    }
}

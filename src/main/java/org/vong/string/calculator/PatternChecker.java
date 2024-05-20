package org.vong.string.calculator;

import java.util.regex.Pattern;

public class PatternChecker {
    public static final String COMPUTABLE_REGEX = "(\\d+[+\\-*/])*\\d+";

    public boolean isComputable(String input) {
        return Pattern.matches(COMPUTABLE_REGEX, input);
    }
}

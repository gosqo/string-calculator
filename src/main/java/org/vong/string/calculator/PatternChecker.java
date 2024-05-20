package org.vong.string.calculator;

import java.util.regex.Pattern;

public class PatternChecker {
    public static final String COMPUTABLE_REGEX = "^(\\d+[+\\-*/])*\\d+$";
    private static final String DIVIDE_BY_0_REGEX = "/0+0*";

    public boolean existDivideBy0(String input) {
        return Pattern.compile(DIVIDE_BY_0_REGEX).matcher(input).find();
    }

    public boolean isComputable(String input) {
        if (existDivideBy0(input))
            throw new ArithmeticException("0 으로 나눌 수 없습니다.");

        return Pattern.matches(COMPUTABLE_REGEX, input);
    }
}

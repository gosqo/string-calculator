package org.vong.string.calculator;

public class Fixture {
    static final String ADDITION = "1+2+3";
    static final String SUBTRACTION = "1-2-3";
    static final String MULTIPLICATION = "11*12*1";
    static final String DIVISION = "11/2/3";
    static final String TWO_DIGITS = "11+22+33+44-44";
    static final String ONLY_DIGIT_0 = "0";
    static final String ONLY_DIGIT_999 = "999";

    public static final String[] PASS_INPUTS = {
            ADDITION
            , SUBTRACTION
            , MULTIPLICATION
            , DIVISION
            , TWO_DIGITS
            , ONLY_DIGIT_999
            , ONLY_DIGIT_0
    };
}

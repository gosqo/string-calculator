package org.vong.string.calculator;

public class Fixture {
    static final String ADDITION = "1+2+3";
    static final String SUBTRACTION = "1-2-3";
    static final String MULTIPLICATION = "11*12*1";
    static final String DIVISION = "11/2/3";
    static final String TWO_DIGITS = "11+22+33+44-44";
    static final String ONLY_DIGIT_0 = "0";
    static final String ONLY_DIGIT_999 = "999";
    static final String DIVIDE_BY_0 = "12+31/0";
    static final String DIVIDE_BY_0_INTERMEDIATE = "34/2/0*123*3";
    static final String DIVIDE_BY_0_INTERMEDIATE_MULTI_0S = "46*2/0000*123*3";
    static final String START_WITH_OPERATOR = "*12+33";

    public static final String[] PASS_INPUTS = {
            ADDITION
            , SUBTRACTION
            , MULTIPLICATION
            , DIVISION
            , TWO_DIGITS
            , ONLY_DIGIT_999
            , ONLY_DIGIT_0
    };

    public static final String[] FAIL_INPUTS = {
            START_WITH_OPERATOR
    };

    public static final String[] THROW_INPUTS = {
            DIVIDE_BY_0
            , DIVIDE_BY_0_INTERMEDIATE
            , DIVIDE_BY_0_INTERMEDIATE_MULTI_0S
    };
}

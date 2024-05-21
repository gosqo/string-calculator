package org.vong.string.calculator;

public class Fixture {
    static final String ADDITION = "1+2+3"; // 6
    static final String SUBTRACTION = "1-2-3"; // -4
    static final String MULTIPLICATION = "11*12*1"; // 132
    static final String DIVISION = "11/2/3"; // double: 1.833_333_333_333_33; long: 1
    static final String TWO_DIGITS = "11+22+33+44-44"; // 66
    static final String ONLY_DIGIT_0 = "0"; // 0
    static final String ONLY_DIGIT_999 = "999"; // 999
    static final String DIVIDE_BY_0 = "12+31/0"; // FAIL divide by 0
    static final String DIVIDE_BY_0_INTERMEDIATE = "34/2/0*123*3"; // FAIL divide by 0
    static final String DIVIDE_BY_0_INTERMEDIATE_MULTI_0S = "46*2/0000*123*3"; // FAIL divide by 0
    static final String START_WITH_OPERATOR = "*12+33"; // FAIL
    static final String DOUBLE_PRECISION_FLOATING_POINT_NUMBER = "1.1"; // 1.1
    static final String FLOATING_OPERATION_INPUT = "1.1*2/.2"; // 11
    static final String WITHOUT_0_FLOATING_POINT = ".2*.4"; // .08
    static final String CHECK_PRECISENESS_ADDITION = ".2+.4"; // .6

    public static final String[] PASS_FLOATING_INPUTS = {
            DOUBLE_PRECISION_FLOATING_POINT_NUMBER
            , FLOATING_OPERATION_INPUT
            , WITHOUT_0_FLOATING_POINT
            , CHECK_PRECISENESS_ADDITION
    };

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

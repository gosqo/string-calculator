package org.vong.string.calculator;

public class Fixture {
    static final String ADD = "1+2+3";
    static final String SUBTRACT = "1-2-3";
    static final String TWO_DIGITS = "11+22+33+44-44";

    public static final String[] PASS_INPUTS = {
            ADD
            , SUBTRACT
            , TWO_DIGITS
            , "999"
            , "1+2"
            , "1-2+3-4+5-6"
            , "0"
    };
}

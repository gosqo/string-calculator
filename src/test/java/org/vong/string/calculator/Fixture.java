package org.vong.string.calculator;

public class Fixture {
    static final String CUSTOM_DELIMITER_INPUT = "//;\n1;2;3";
    static final String MIX_CUSTOM_DELIMITER_INPUT = "//;\n1:2,3;4";
    static final String NORMAL_INPUT_COLON = "1:2:3";
    static final String NORMAL_INPUT_COMMA = "1,2,3";
    static final String MIX_NORMAL_DELIMITER_INPUT = "1,2:3";
    static final String[] INPUTS_PASS = {
            CUSTOM_DELIMITER_INPUT
            , NORMAL_INPUT_COLON
            , NORMAL_INPUT_COMMA
    };
    static final String[] INPUTS_FAIL = {
            MIX_CUSTOM_DELIMITER_INPUT
            , MIX_NORMAL_DELIMITER_INPUT
    };
}

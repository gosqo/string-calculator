package org.vong.string.calculator;

public class Fixture {
    static final String CUSTOM_DELIMITER = "//;\n1;2;3";
    static final String COLON_DELIMITER = "1:2:3";
    static final String COMMA_DELIMITER = "1,2,3";
    static final String MIX_DEFAULT_DELIMITER = "1,2:3";
    static final String MIX_CUSTOM_AND_DEFAULT_DELIMITER = "//;\n1:2,3;4";
    static final String NOT_SPECIFIED_DELIMITER = "1/2/3";
    static final String SPECIFIED_MULTIPLE_DELIMITER = "//;'%\n1;2'3%4";

    static final String[] INPUTS_PASS = {
            CUSTOM_DELIMITER
            , COLON_DELIMITER
            , COMMA_DELIMITER
            , MIX_DEFAULT_DELIMITER
            , MIX_CUSTOM_AND_DEFAULT_DELIMITER
    };
    static final String[] INPUTS_FAIL = {
            NOT_SPECIFIED_DELIMITER
            , SPECIFIED_MULTIPLE_DELIMITER
    };
}

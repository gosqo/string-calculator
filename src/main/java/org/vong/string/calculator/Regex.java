package org.vong.string.calculator;

public class Regex {
    static final String COMPUTABLE_REGEX = "^(" +
            "[\\d+]?[.]?\\d+" + // 숫자부, 정수부와 소수점이 있거나 없거나 하나 이상의 숫자는 있어야 함.
                                // ".2" => "0.2" 로 인식

            "[+\\-*/]" + // 연산자 중 하나는 있어야 함.

            ")*" + // 위 숫자부와 연산자의 표현식이 없거나 있거나 하나 이상.

            "[\\d+]?[.]?\\d+$"; // 상기 숫자부와 동일. 상기 숫자부와 연산자 그룹이 없더라도
    // 존재해야 함.
    // COMPUTABLE_REGEX = "^([\\d+]?[.]?\\d+[+\\-*/])*[\\d+]?[.]?\\d+$";
    static final String DIVIDE_BY_0_REGEX = "/0+";
    static final String TOKEN_REGEX = "(\\d+\\.\\d+)|(\\.\\d+)|\\d+|[+\\-*/]";
    static final String OPERATOR_TOKEN_REGEX = "[+\\-*/]";
}

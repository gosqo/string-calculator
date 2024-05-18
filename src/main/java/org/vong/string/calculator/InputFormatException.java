package org.vong.string.calculator;

public class InputFormatException extends RuntimeException {
    public InputFormatException(String input) {
        super(String.format("""
                %s: 형식에 맞지 않는 입력입니다.
                입력값은 정수와 연산자로 구성해야합니다.
                """, input));
    }
}

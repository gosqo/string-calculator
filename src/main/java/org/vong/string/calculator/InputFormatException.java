package org.vong.string.calculator;

public class InputFormatException extends RuntimeException {
    public InputFormatException() {
        super("""
                형식에 맞지 않는 입력입니다.
                입력값은 양의 정수와 구분자로 구성해야합니다.
                """);
    }
}

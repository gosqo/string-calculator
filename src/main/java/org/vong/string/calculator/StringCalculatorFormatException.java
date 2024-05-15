package org.vong.string.calculator;

public class StringCalculatorFormatException extends RuntimeException{
    public StringCalculatorFormatException() {
        super("\n형식에 맞지 않는 입력입니다.\n0 혹은 양의 정수만 입력 가능하며, 구분자는 통일되어야 합니다.\n");
    }
}

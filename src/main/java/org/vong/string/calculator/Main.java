package org.vong.string.calculator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        Calculator calculator = new Calculator();
        String input;
        VO vo;

        while (true) {
            System.out.println(Reader.MESSAGE_FOR_READ);

            input = reader.getInputTilEndsWithDigit();
            vo = new VO(input);

            try {
                long sum = calculator.calculate(vo);
                System.out.println("계산 결과: " + sum);
                break;
            } catch (RuntimeException e) {
                System.out.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
    }
}

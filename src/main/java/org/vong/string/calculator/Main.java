package org.vong.string.calculator;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        PatternChecker checker = new PatternChecker();
        Extractor extractor = new Extractor();
        Operator operator = new Operator();
        Tokenizer tokenizer = new Tokenizer();
        Mapper mapper = new Mapper();
        Reader reader = new Reader();

        Scanner sc = new Scanner(System.in);

        String[] arr;
        String delimiter;
        long[] numbers;
        long sum;

        while (true) {

            System.out.println("""
                    =============================
                    계산할 값을 구분자와 함께 입력해주세요. ex. 1,2,3 혹은 1:2:3
                    ; 과 같은 구분자를 지정하고 싶다면
                    //; 을 입력 후 엔터를 누르고 계산할 값 지정 구분자와 함꼐 입력해주세요.
                    =======================================================
                    """);

            String input = reader.getInputTilEndsWithDigit();

            try {
                delimiter = extractor.extractDelimiter(input);
                if (checker.caseOf(input).equals(PatternChecker.CUSTOM_DELIMITER_REGEX)) {
                    input = input.substring(4);
                }
                arr = tokenizer.splitWithDelimiter(delimiter, input);
                numbers = mapper.mapStringToLong(arr);

                break;
            } catch (RuntimeException e) {
                System.out.println(e.getClass().getName());
                System.out.println(e.getMessage());
            }
        }

        sum = operator.sum(numbers);
        System.out.println("계산 결과: " + sum);
    }
}

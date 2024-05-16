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
            System.out.println(Reader.MESSAGE_FOR_READ);

            String input = reader.getInputTilEndsWithDigit();

            try {
                delimiter = extractor.extractDelimiter(input);
                if (checker.caseOf(input).equals(PatternChecker.CUSTOM_DELIMITER_REGEX)) {
                    input = extractor.removeCustomClause(input);
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

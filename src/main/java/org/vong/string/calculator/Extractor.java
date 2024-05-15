package org.vong.string.calculator;

public class Extractor {
    private final PatternChecker checker = new PatternChecker();

    public String extractDelimiter(String input) {
        String delimiter = "";

        if (checker.hasCustomDelimiter(input)) {
            delimiter = input.substring(2,3);
        }
        if (checker.delimitWithComma(input)) {
            delimiter = ",";
        }
        if (checker.delimitWithColon(input)) {
            delimiter = ":";
        }
        if (delimiter.isEmpty()) {
            throw new StringCalculatorFormatException();
        }

        return delimiter;
    }
}

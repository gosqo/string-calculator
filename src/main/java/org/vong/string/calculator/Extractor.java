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
            throw new RuntimeException("형식에 맞지 않는 입력입니다.\n0 혹은 양의 정수만 입력 가능하며, 구분자는 통일되어야 합니다.");
        }

        return delimiter;
    }
}

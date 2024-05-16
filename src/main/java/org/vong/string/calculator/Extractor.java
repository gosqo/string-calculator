package org.vong.string.calculator;

public class Extractor {
    public static final String CUSTOM_CLAUSE_END_CHARACTER = "\n";
    public static final String CUSTOM_CLAUSE_START_STRING = "//";

    private final PatternChecker checker = new PatternChecker();

    private int getCustomClauseBeginIndex() {
        return CUSTOM_CLAUSE_START_STRING.length() - 1;
    }

    private int getCustomClauseEndIndex() {
        return getCustomClauseBeginIndex() + 2;
    }

    public String removeCustomClause(String input) {
        return input.substring(getCustomClauseEndIndex() + 1);
    }

    public String extractDelimiter(String input) {
        String delimiter = "";

        if (checker.hasCustomDelimiter(input)) {
            delimiter = input.substring(getCustomClauseBeginIndex(),getCustomClauseEndIndex());
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

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

    private String extractCustomDelimiter(String input) {
        return input.substring(getCustomClauseBeginIndex(),getCustomClauseEndIndex());
    }

    public String extractDelimiter(String input) {
        String delimiter ="";

        if (checker.hasCustomDelimiter(input)) {
            delimiter = extractCustomDelimiter(input);
            return delimiter;
        }
        if (checker.delimitWithComma(input)) {
            delimiter = ",";
            return delimiter;
        }
        if (checker.delimitWithColon(input)) {
            delimiter = ":";
            return delimiter;
        }

        throw new StringCalculatorFormatException();
    }
}

package org.vong.string.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extractor {
    public static final String CUSTOM_CLAUSE_END_CHARACTER = "\n";
    public static final String CUSTOM_CLAUSE_START_STRING = "//";
    public static final String DEFAULT_DELIMITER_REGEX = ",|:";
    public static final String CUSTOM_DELIMITER_REGEX = "|,|:";
    private final Pattern customDelimiterPattern = Pattern.compile(PatternChecker.CUSTOM_DELIMITER_REGEX);
    private final PatternChecker checker = new PatternChecker();

    public VO returnVoWithDelimiterAndInput(VO vo) {
        String delimiter = extractDelimiter(vo.getInput());
        String refinedInput = removeIfCustomClauseExist(vo.getInput());

        vo.setDelimiter(delimiter);
        vo.setRefinedInput(refinedInput);
        return vo;
    }

    private int getCustomClauseBeginIndex() {
        return CUSTOM_CLAUSE_START_STRING.length();
    }

    private int getCustomClauseEndIndex() {
        return getCustomClauseBeginIndex() + 1;
    }

    public String removeIfCustomClauseExist(String input) {
        Matcher matcher = customDelimiterPattern.matcher(input);
        return matcher.matches()
                ? input.substring(getCustomClauseEndIndex() + 1)
                : input;
    }

    private String extractCustomDelimiter(String input) {
        Matcher matcher = customDelimiterPattern.matcher(input);
        if (matcher.matches()) return matcher.group(1);
        throw new InputFormatException();
    }

    public String extractDelimiter(String input) {
        if (checker.hasCustomDelimiter(input)) {
            return extractCustomDelimiter(input) + CUSTOM_DELIMITER_REGEX;
        }
        if (checker.hasDefaultDelimiter(input)) {
            return DEFAULT_DELIMITER_REGEX;
        }

        throw new InputFormatException();
    }
}

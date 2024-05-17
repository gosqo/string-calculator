package org.vong.string.calculator;

public class Tokenizer {
    private final Extractor extractor = new Extractor();

    public VO returnVoWithTokenized(VO vo) {
        vo = extractor.returnVoWithDelimiterAndInput(vo);
        String[] tokenized = splitWithDelimiter(vo.getDelimiter(), vo.getRefinedInput());
        vo.setTokenized(tokenized);
        return vo;
    }

    public String[] splitWithDelimiter(String delimiter, String input) {
        return input.split(delimiter);
    }
}

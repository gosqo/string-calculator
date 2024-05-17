package org.vong.string.calculator;

public class VO {
    private final String input;
    private String refinedInput;
    private String delimiter;
    private String[] tokenized;
    private long[] mappedInLong;
    private long result;

    public VO(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public String getRefinedInput() {
        return refinedInput;
    }

    public void setRefinedInput(String refinedInput) {
        this.refinedInput = refinedInput;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String[] getTokenized() {
        return tokenized;
    }

    public void setTokenized(String[] tokenized) {
        this.tokenized = tokenized;
    }

    public long[] getMappedInLong() {
        return mappedInLong;
    }

    public void setMappedInLong(long[] mappedInLong) {
        this.mappedInLong = mappedInLong;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }
}

package org.vong.string.calculator;

import java.util.List;

public class Operation {
    static final String OPERATOR_TOKEN_REGEX = "[+\\-]";

    private final Tokenizer tokenizer;

    public Operation(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    public long operate(String input) {
        return operate(tokenizer.tokenize(input));
    }

    public long operate(List<String> list) {
        long result = Long.parseLong(list.get(0));
        String operator = "";
        long operand;

        for (int i = 1; i < list.size(); i++) {
            String item = list.get(i);
            if (item.matches(OPERATOR_TOKEN_REGEX)) {
                operator = item;
                continue;
            }
            operand = Long.parseLong(item);
            result = applyOperator(operator, result, operand);
        }

        return result;
    }

    private long applyOperator(String operator, long result, long operand) {
        return switch (operator) {
            case "+" -> result += operand;
            case "-" -> result -= operand;
            default -> throw new IllegalArgumentException("Invalid operator.");
        };
    }
}

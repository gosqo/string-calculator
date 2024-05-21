package org.vong.string.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Operation {
    private final Tokenizer tokenizer;

    public Operation(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    public BigDecimal operateBigDecimal(String input) {
        return operateBigDecimal(tokenizer.tokenize(input));
    }

    public BigDecimal operateBigDecimal(List<String> list) {
        BigDecimal result = new BigDecimal(list.get(0));
        String operator = "";
        BigDecimal operand;

        for (int i = 1; i < list.size(); i++) {
            String item = list.get(i);
            if (item.matches(Regex.OPERATOR_TOKEN_REGEX)) {
                operator = item;
                continue;
            }
            operand = new BigDecimal(item);
            result = applyOperatorBigDecimal(operator, result, operand);
        }

        return Trimmer.trimPoint0(result);
    }
    private BigDecimal applyOperatorBigDecimal(String operator, BigDecimal result, BigDecimal operand) {
        return switch (operator) {
            case "+" -> result.add(operand);
            case "-" -> result.subtract(operand);
            case "*" -> result.multiply(operand);
            case "/" -> result.divide(operand, RoundingMode.HALF_UP);
            default -> throw new IllegalArgumentException("Invalid operator.");
        };
    }
}

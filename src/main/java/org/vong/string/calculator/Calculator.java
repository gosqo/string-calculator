package org.vong.string.calculator;

public class Calculator {
    private final PatternChecker checker;
    private final Operation operation;

    public Calculator(PatternChecker checker, Operation operation) {
        this.checker = checker;
        this.operation = operation;
    }

    public void calculate(String input) {
        if (!checker.isComputable(input)) {
            throw new InputFormatException(input);
        }

        System.out.println(operation.operateBigDecimal(input));
    }
}

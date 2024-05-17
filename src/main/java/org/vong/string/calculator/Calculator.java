package org.vong.string.calculator;

public class Calculator {
    private final Operator operator = new Operator();

    public long calculate(VO vo) {
        return operator.returnVoWithResult(vo).getResult();
    }
}

package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OperatorTest {
    private Operator operator;

    @BeforeEach
    void assignNewOperator() {
        operator = new Operator();
    }

    @Test
    void sum() {
        assertThat(operator.sum(new long[]{1L, 2L, 3L})).isEqualTo(6L);
    }
}
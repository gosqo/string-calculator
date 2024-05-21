package org.vong.string.calculator;

import java.math.BigDecimal;

public class Trimmer {
    public static BigDecimal trimPoint0(BigDecimal calculationResult) {
        return calculationResult.stripTrailingZeros();
    }
}

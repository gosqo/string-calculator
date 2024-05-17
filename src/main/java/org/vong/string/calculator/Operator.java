package org.vong.string.calculator;

import java.util.Arrays;

public class Operator {
    private final Mapper mapper = new Mapper();

    public VO returnVoWithResult(VO vo) {
        vo = mapper.returnVoWithMapped(vo);
        long result = sum(vo.getMappedInLong());
        vo.setResult(result);
        return vo;
    }

    public long sum(long[] numbers) {
        return (Arrays.stream(numbers).sum());
    }
}

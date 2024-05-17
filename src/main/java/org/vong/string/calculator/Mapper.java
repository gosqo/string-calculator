package org.vong.string.calculator;

import java.util.Arrays;

public class Mapper {
    private final Tokenizer tokenizer = new Tokenizer();

    public VO returnVoWithMapped(VO vo) {
        vo = tokenizer.returnVoWithTokenized(vo);
        long[] mappedInLong = mapStringToLong(vo.getTokenized());
        vo.setMappedInLong(mappedInLong);
        return vo;
    }

    public long[] mapStringToLong(String[] tokenized) {
        return (Arrays.stream(tokenized).mapToLong(Long::parseLong).toArray());
    }
}

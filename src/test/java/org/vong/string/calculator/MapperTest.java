package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MapperTest {
    private Mapper mapper;

    @BeforeEach
    void assignNewMapper() {
        mapper = new Mapper();
    }

    @Test
    void mapStringToLong() {
        assertThat(mapper.mapStringToLong(new String[]{"1", "2", "3"})).isEqualTo(new long[]{1L, 2L, 3L});
    }
}
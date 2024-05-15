package org.vong.string.calculator;

import java.util.Arrays;

public class Mapper {
    public long[] mapStringToLong(String[] arr) {
         return Arrays.stream(arr).mapToLong(Long::parseLong).toArray();
    }
}

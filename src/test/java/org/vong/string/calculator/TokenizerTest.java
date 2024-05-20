package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vong.string.calculator.Fixture.PASS_INPUTS;

class TokenizerTest {
    private static final String DIGIT = "^\\d+$";
    private static final String OPERATOR = "^[+\\-*/]$";

    private Tokenizer tokenizer;

    @BeforeEach
    void setUp() {
        tokenizer = new Tokenizer();
    }

    List<String> filterEvenIndex(List<String> inputList) {
        return IntStream.range(0, inputList.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(inputList::get)
                .toList();
    }

    List<String> filterOddIndex(List<String> inputList) {
        return IntStream.range(0, inputList.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(inputList::get)
                .toList();
    }

    @Test
    void tokenize() {
        for (String input : PASS_INPUTS) {
            List<String> list = tokenizer.tokenize(input);
            System.out.printf("""
                    %s
                    tokenized: %s%n
                    """, input, list
            );

            assertThat(filterEvenIndex(list)).matches(item ->
                    item.stream().allMatch(
                            e -> Pattern.matches(DIGIT, e)
                    ), "digits expected."
            );
            assertThat(filterOddIndex(list)).matches(item ->
                    item.stream().allMatch(
                            e -> Pattern.matches(OPERATOR, e)
                    ), "operator expected.");
        }
    }
}

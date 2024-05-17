package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.vong.string.calculator.Fixture.COLON_DELIMITER;
import static org.vong.string.calculator.Fixture.CUSTOM_DELIMITER;

class ExtractorTest {
    private Extractor extractor;

    @BeforeEach
    void assignNewExtractor() {
        extractor = new Extractor();
    }

    @Test
    void extractDelimiter() {
        assertThat(extractor.extractDelimiter(CUSTOM_DELIMITER)).isEqualTo(";|,|:");
        assertThat(extractor.extractDelimiter(COLON_DELIMITER)).isEqualTo(",|:");
    }

    @Test
    void extractDelimiterThrownBy() {
        assertThatThrownBy(() -> {
            for (String input : Fixture.INPUTS_FAIL) {
                extractor.extractDelimiter(input);
            }
        });
    }
}

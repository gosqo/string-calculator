package org.vong.string.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vong.string.calculator.Fixture.*;

class ExtractorTest {
    private Extractor extractor;

    @BeforeEach
    void assignNewExtractor() {
        extractor = new Extractor();
    }

    @Test
    void extractDelimiter() {
        assertThat(extractor.extractDelimiter(CUSTOM_DELIMITER_INPUT)).isEqualTo(";");
        assertThat(extractor.extractDelimiter(NORMAL_INPUT_COLON)).isEqualTo(":");
        assertThat(extractor.extractDelimiter(NORMAL_INPUT_COMMA)).isEqualTo(",");
    }
}
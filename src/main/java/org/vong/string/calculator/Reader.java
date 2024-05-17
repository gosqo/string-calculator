package org.vong.string.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static final String MESSAGE_FOR_READ = """
                    ========================================================
                    계산할 값을 구분자와 함께 입력해주세요. ex. 1,2,3 혹은 1:2:3
                    ; 과 같은 구분자를 지정하고 싶다면
                    //; 을 입력 후 엔터를 누르고 계산할 값과 지정 구분자와 함꼐 입력해주세요.
                    ========================================================
                    """;

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String getInputTilEndsWithDigit() throws IOException {
        String line;
        StringBuilder input = new StringBuilder();

        while(true) {
            line = br.readLine();

            if (line.isEmpty()) break;

            input.append(line);

            if (Character.isDigit(line.charAt(line.length() - 1))) break;

            input.append(Extractor.CUSTOM_CLAUSE_END_CHARACTER);
        }
        return input.toString();
    }
}

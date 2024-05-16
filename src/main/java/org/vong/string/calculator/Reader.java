package org.vong.string.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String getInputTilEndsWithDigit() throws IOException {
        String line;
        StringBuilder input = new StringBuilder();

        while(true) {
            line = br.readLine();
            if (line.isEmpty()) break;

            input.append(line);

            if (Character.isDigit(line.charAt(line.length() - 1))) break;

            input.append("\n");
        }

        return input.toString();
    }
}

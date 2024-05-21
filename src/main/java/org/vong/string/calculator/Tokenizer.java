package org.vong.string.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {
    private final Pattern pattern = Pattern.compile(Regex.TOKEN_REGEX);

    public List<String> tokenize(String input) {
        Matcher matcher = pattern.matcher(input);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());
        }
        return list;
    }
}

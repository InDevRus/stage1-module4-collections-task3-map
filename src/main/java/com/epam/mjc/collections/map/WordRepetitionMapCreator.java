package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class WordRepetitionMapCreator {
    private static final Pattern WORDS_PATTERN = Pattern.compile("[a-zA-Z]+");

    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        var matcher = WORDS_PATTERN.matcher(sentence);
        var result = new HashMap<String, Integer>();
        while (matcher.find()) {
            var word = matcher.group().toLowerCase();
            result.put(word, result.getOrDefault(word, 0) + 1);
        }
        return result;
    }
}

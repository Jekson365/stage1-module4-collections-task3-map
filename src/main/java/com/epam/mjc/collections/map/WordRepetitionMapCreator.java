package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> wordRepetitionMap = new HashMap<>();

        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();

            wordRepetitionMap.put(word, wordRepetitionMap.getOrDefault(word, 0) + 1);
        }

        return wordRepetitionMap;

    }
}

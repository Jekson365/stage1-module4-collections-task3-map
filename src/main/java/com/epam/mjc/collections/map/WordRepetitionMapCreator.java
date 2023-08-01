package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> wordRepetitionMap = new HashMap<>();

        // Create a StringTokenizer with whitespace as the delimiter
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");

        // Loop through each word and count the repetitions
        while (tokenizer.hasMoreTokens()) {
            // Get the next word and convert it to lowercase
            String word = tokenizer.nextToken().toLowerCase();

            // Update the count in the HashMap
            wordRepetitionMap.put(word, wordRepetitionMap.getOrDefault(word, 0) + 1);
        }

        return wordRepetitionMap;

    }
}

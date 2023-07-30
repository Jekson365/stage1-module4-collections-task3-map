package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        String[] w = sentence.split("\\W+");

        Map<String, Integer> reps = new HashMap<>();
        if (!sentence.isEmpty()) {

        for (String word : w) {
            String lowercaseWord = word.toLowerCase();

            reps.put(lowercaseWord, reps.getOrDefault(lowercaseWord, 0) + 1);
        }

            return reps;
        }
        else {
            return reps;
        }
    }
}

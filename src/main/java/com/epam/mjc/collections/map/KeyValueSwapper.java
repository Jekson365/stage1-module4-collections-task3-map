package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();

        Map<String, Integer> reverseMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            String value = entry.getValue();
            int key = entry.getKey();

            if (reverseMap.containsKey(value)) {
                int existingKey = reverseMap.get(value);
                if (existingKey < key) {
                    continue;
                }
            }

            reverseMap.put(value, key);
        }
        for (Map.Entry<String, Integer> entry : reverseMap.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}

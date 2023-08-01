package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();

        // Create a reverse mapping of values to keys
        Map<String, Integer> reverseMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            String value = entry.getValue();
            int key = entry.getKey();

            // If the value already exists in the reverseMap, use the smaller key
            if (reverseMap.containsKey(value)) {
                int existingKey = reverseMap.get(value);
                if (existingKey < key) {
                    continue; // Skip this entry if an existing key is smaller
                }
            }

            reverseMap.put(value, key);
        }

        // Swap the keys and values in the reverseMap and store in the result map
        for (Map.Entry<String, Integer> entry : reverseMap.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}

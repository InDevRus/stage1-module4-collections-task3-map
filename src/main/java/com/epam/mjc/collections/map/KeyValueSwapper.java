package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        var inversedMap = new HashMap<String, Integer>();
        for (var key: sourceMap.keySet()) {
            var value = sourceMap.get(key);
            inversedMap.put(value, Math.min(inversedMap.getOrDefault(value, Integer.MAX_VALUE), key));
        }
        return inversedMap;
    }
}

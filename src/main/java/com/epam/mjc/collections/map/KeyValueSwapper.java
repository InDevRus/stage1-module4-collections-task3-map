package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        var inversedMap = new HashMap<String, Integer>();
        for (var entry : sourceMap.entrySet()) {
            inversedMap.put(
                    sourceMap.get(entry.getKey()),
                    Math.min(inversedMap.getOrDefault(sourceMap.get(entry.getKey()), Integer.MAX_VALUE), entry.getKey()));
        }
        return inversedMap;
    }
}

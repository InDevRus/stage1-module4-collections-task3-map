package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        var functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        var functionMap = new HashMap<Integer, Integer>();
        for (var element: sourceList) {
            functionMap.put(element, mappingFunction(element));
        }
        return functionMap;
    }

    private Integer mappingFunction(Integer x) {
        return 5 * x + 2;
    }
}

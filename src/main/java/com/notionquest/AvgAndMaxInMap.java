package com.notionquest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgAndMaxInMap {
    public String getMaxAverage(Map<String, List<Integer>> studentMap) {
        Map<String, Double> stuAvg = studentMap.entrySet().stream()
                .collect(
                        Collectors.toMap(
                            e -> e.getKey(),
                            e -> e.getValue()
                                    .stream()
                                    .mapToInt(i->i)
                                    .average().getAsDouble()));

        return stuAvg.entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).get();

    }
}

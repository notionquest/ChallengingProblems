package com.notionquest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AvgAndMaxInMapTest {
    private AvgAndMaxInMap avgAndMaxInMap;
    @Before
    public void init() {
        avgAndMaxInMap = new AvgAndMaxInMap();
    }

    @Test
    public void getMaxValue () {
        Map<String, List<Integer>> stuMap = new HashMap<>();
        stuMap.put("Charles", Arrays.asList(62, 62));
        stuMap.put("Dinesh", Arrays.asList(51, 51));

        Assert.assertEquals("Charles", avgAndMaxInMap.getMaxAverage(stuMap));
    }
}

package com.notionquest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxHourGlassInArrayTest {
    private MaxHourGlassInArray maxHourGlassInArray;

    @Before
    public void init() {
        maxHourGlassInArray = new MaxHourGlassInArray();
    }

    @Test
    public void shouldGetHourGlassMaximumFor6X6() {
        int[][] arr = {{1,1,1,0,0,0},
                {0, 1, 0, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0,},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        Assert.assertEquals(19, maxHourGlassInArray.getMaxHourGlass(arr));
    }

    @Test
    public void shouldGetHourGlassMaximumFor9X9() {
        int[][] arr = {{1,1,1,0,0,0,0,0,0},
                {0, 1, 0, 0, 0, 0, 0,0,0,0},
                {1, 1, 1, 0, 0, 0, 0,0,0,0},
                {0, 0, 2, 4, 4, 0, 0,0,0,0},
                {0, 0, 0, 2, 0, 0, 0,0,0,0},
                {0, 0, 1, 2, 4, 0, 0,0,0,0}};
        Assert.assertEquals(19, maxHourGlassInArray.getMaxHourGlass(arr));
    }

    @Test
    public void shouldGetHourGlassMaximumFor3X3() {
        int[][] arr = {{1,1,1},
                {0, 1, 0},
                {1, 1, 1}
        };
        Assert.assertEquals(7, maxHourGlassInArray.getMaxHourGlass(arr));
    }

    @Test
    public void shouldGetHourGlassMaximumNegativeFor3X3() {
        int[][] arr = {{-1,-1,-1},
                {0, -1, 0},
                {-1, -1, -1}
        };
        Assert.assertEquals(-7, maxHourGlassInArray.getMaxHourGlass(arr));
    }

    @Test
    public void shouldGetHourGlassMaximumForEmptyArr() {
        int[][] arr = {
        };
        Assert.assertEquals(0, maxHourGlassInArray.getMaxHourGlass(arr));
    }
}

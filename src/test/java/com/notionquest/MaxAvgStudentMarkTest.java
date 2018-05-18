package com.notionquest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxAvgStudentMarkTest {
    private MaxAvgStudentMark maxAvgStudentMark;

    @Before
    public void init() {
        maxAvgStudentMark = new MaxAvgStudentMark();
    }

    @Test
    public void shouldGetMaxAvgMarkOfStudents() {
        String [][] stuMarks = {{"Charles", "61"},
                {"Charles", "71"},
                {"Mark", "61"}};
        Assert.assertEquals("Charles", maxAvgStudentMark.getStudentMark(stuMarks));
    }

    @Test
    public void shouldGetMaxAvgMarkOfStudentsTest2() {
        String [][] stuMarks = {{"Charles", "61"},
                {"Charles", "71"},
                {"Mark", "61"},
                {"Godwin", "100"}};
        Assert.assertEquals("Godwin", maxAvgStudentMark.getStudentMark(stuMarks));
    }
}

package com.notionquest;

import com.notionquest.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxAvgStudentMark {

    public String getStudentMark(String [][] studentMarks) {
        List<Student> students = new ArrayList<>();
        for (int row=0; row<studentMarks.length;row++) {
            students.add(new Student(studentMarks[row][0],new Double(studentMarks[row][1])));
        }
        Map<String, Double> stuAvgMap = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getMark)));

        return stuAvgMap.entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).get();
    }
}

package com.notionquest;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ConvertToMilitaryTime {

    public static void main(String[] args) {
        LocalTime time = LocalTime.parse("07:05:45PM", DateTimeFormatter.ofPattern("hh:mm:ssa"));
        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        time = LocalTime.parse("07:05:45AM", DateTimeFormatter.ofPattern("hh:mm:ssa"));
        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        time = LocalTime.parse("12:05:45PM", DateTimeFormatter.ofPattern("hh:mm:ssa"));
        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        time = LocalTime.parse("00:05:45AM", DateTimeFormatter.ofPattern("hh:mm:ssa"));
        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));



    }
}

package com.notionquest;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AnagramCount {

    public static int numberNeeded(String first, String second) {
        int[] firstChar = new int[26];
        int[] secondChar = new int[26];
        for (int i=0; i<first.length();i++) {
            firstChar[first.charAt(i) -97]++;
        }

        for (int j=0; j< second.length(); j++) {
            secondChar[second.charAt(j) -97]++;
        }


        int sum = IntStream.rangeClosed(0, 25).map(i -> Math.abs(firstChar[i]-secondChar[i])).sum();

        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

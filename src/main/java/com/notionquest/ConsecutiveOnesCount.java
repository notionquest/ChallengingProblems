package com.notionquest;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveOnesCount {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binaryStr = Integer.toBinaryString(n);
        String onesArr[] = binaryStr.split("0");
        int maxCount = Arrays.stream(onesArr).mapToInt(e -> Integer.valueOf(e.length())).max().getAsInt();
        System.out.println(maxCount);


    }
}

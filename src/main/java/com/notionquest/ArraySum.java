package com.notionquest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySum {
    public static void main(String[] args) {

        int[] ar = new int[]{1, 2, 3, 4, 10, 11};
        System.out.println(Arrays.stream(ar).count());

        int[] in = new int[] {5,3,6,6,7,10};
        List<Integer> arr = new ArrayList<>();
        for (int i=0; i < (in.length/2) ; i++) {
            if (in[i] != in[i+1]) {
                arr.add(1);
            }
        }
        String out = arr.stream().map(e -> e.toString())
                .collect(Collectors.joining(" "));
        System.out.println(arr.stream().mapToInt(e->e).toArray());
        System.out.println(out);

        long[] lr = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        Arrays.stream(lr).sum();
        Arrays.stream(lr).max().getAsLong();

    }
}

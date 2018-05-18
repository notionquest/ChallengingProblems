package com.notionquest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AbsolutePermutation {
    public int[] absolutePermutation(int n, int k) {

        int[] out = new int[n];
        int[] nopo = new int[]{-1};

        //all numbers should be equal
        if (k == 0)

        {
            List<Integer> ints = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
            return ints.stream().mapToInt(e -> e).toArray();
        }

        //Not possible
        if (k >= n)

        {
            return nopo;
        } else if (n % 2 == 0)

        {
            //even
            int mid = n / 2;
            if (k > mid) {
                return nopo;
            }
        } else

        {
            //odd
            int mid = n / 2 + 1;
            if (k >= mid) {
                return nopo;
            }
        }

        for (
                int i = 1;
                i <= n; i++)

        {
            int p = i + k;
            if (p == n) {
                if (n % 2 == 0) {
                    out[i - 1] = p;
                } else {
                    out[i - 1] = 1;
                }
            } else if (p > n) {
                out[i - 1] = Math.abs(i - k);
            } else {
                out[i - 1] = p;
            }

        }

        return out;

    }
}
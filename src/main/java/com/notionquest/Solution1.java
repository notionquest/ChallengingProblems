package com.notionquest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Solution1 {

    /*
     * Complete the absolutePermutation function below.
     */
    static int[] absolutePermutation(int n, int k) {
        /*
         * Write your code here.
         */
        int [] out = new int[n];
        int[] nopo = new int[] {-1};

        //all numbers should be equal
        if (k==0) {
            List<Integer> ints = IntStream.rangeClosed(1,n).boxed().collect(Collectors.toList());
            return ints.stream().mapToInt(e->e).toArray();
        }

        //Not possible
        if (k >= n) {
            return nopo;
        } else if (n % 2 == 0) {
            //even
            int mid = n/2;
            if (k > mid) {
                return nopo;
            }
        } else {
            //odd
            int mid = n/2 + 1;
            if (k >= mid) {
                return nopo;
            }
        }

        for (int i=1; i<=n; i++) {
            int per = i + k;
            if (per == n) {
                if (n%2 == 0) {
                    out[i-1] =per;
                } else{
                    out[i-1] =1;
                }
            } else if (per > n) {
                out[i-1] = Math.abs(i - k);
            } else {
                out[i-1] = per;
            }
        }
        return out;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0].trim());

            int k = Integer.parseInt(nk[1].trim());

            int[] result = absolutePermutation(n, k);

            for (int resultItr = 0; resultItr < result.length; resultItr++) {
                bufferedWriter.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}

package com.notionquest;

import java.util.ArrayList;
import java.util.List;

public class MaxHourGlassInArray {
    public int getMaxHourGlass(int[][] inputArray) {
        List<Integer> sumList = new ArrayList<>();
        if (inputArray.length >= 3) {
            for (int row = 0; row < inputArray.length - 2; row++) {
                for (int col = 0; col < inputArray[row].length - 2; col++) {
                    int sum = inputArray[row][col] + inputArray[row][col + 1] + inputArray[row][col + 2]
                            + inputArray[row + 1][col + 1]
                            + inputArray[row + 2][col] + inputArray[row + 2][col + 1] + inputArray[row + 2][col + 2];

                    sumList.add(sum);
                }
            }
        }

        int sum = 0;
        if (!sumList.isEmpty()) {
            return sumList.stream().mapToInt(e -> e).max().getAsInt();
        } else {
            return sum;
        }


    }

}

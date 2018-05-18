package com.notionquest;

public class SaddlePoint {
    public int solution(int[][] A) {
        System.out.println("******************************");
        int row = A.length;
        int col = A[0].length;
        int countOfSaddlePoint = 0;
        for (int P = 0; P < row; P++) {
            for (int Q = 0; Q < col; Q++) {

                if ((P > 0 && P < row - 1) && (Q > 0 && Q < col - 1)) {
                    if ((A[P][Q - 1] > A[P][Q] && A[P][Q] < A[P][Q + 1]) &&
                            (A[P - 1][Q] < A[P][Q] && A[P][Q] > A[P + 1][Q])) {
                        countOfSaddlePoint++;
                    }
                    if ((A[P][Q - 1] < A[P][Q] && A[P][Q] > A[P][Q + 1]) &&
                            (A[P - 1][Q] > A[P][Q] && A[P][Q] < A[P + 1][Q])) {
                        countOfSaddlePoint++;
                    }
                }
            }
        }
        return countOfSaddlePoint;
    }

    public static void main(String[] args) {

        SaddlePoint m = new SaddlePoint()   ;
        //int[][] A = {  { 0,1,9,3 }, { 7,5,8,3 } ,  { 9,2,9,4 }, { 4,6,7,1 }  };
        //int[][] A = {  { 0,0,0,0 }, { 0,0,0,0 } ,  { 0,0,0,0 }, { 0,0,0,0 }  };
        //int[][] A = {  { 0,1,9,3 }, { 7,0,8,3 } ,  { 9,2,9,4 }, { 4,6,7,1 }  };
        //int[][] A = {  { 0,1,9,3 }, { 7,5,5,3 } ,  { 9,2,9,4 }, { 4,6,7,1 }  };
        int[][] A = {  { 0,1,8,3 }, { 7,5,8,3 } ,  { 9,2,9,4 }, { 4,6,7,1 }  };
        int f = m.solution(A);
        System.out.println(f);
        // write your code here
    }
}

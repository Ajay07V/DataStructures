package com.array;

import java.util.Arrays;

public class MaxNumInEachRow {
    public void findMaxInEachRow(int[][] ar) {
        int rowLen = ar.length;
        int colLen = ar[0].length;
        int max = ar[0][0];
        int temp = 0;
        int[] arr = new int[rowLen];
        int index = 0;
        for (int k = 0; k < rowLen; k++) {
            for (int i = 0; i < colLen; i++) {
                if (max <= ar[k][i]) {
                    max = ar[k][i];
                }
            }
            arr[index] = max;
            index++;

        }
        System.out.println(Arrays.toString(arr));
    }
}

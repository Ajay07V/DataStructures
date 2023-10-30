package dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ar = {3, 1, 2, 7, 6, 9};
        sortUsingInsertSort(ar);
    }

    private static void sortUsingInsertSort(int[] ar) {
        int n = ar.length;
        for (int i = 0; i < n-1; i++) {
            int temp = 0;
            for (int j = i; j >= 0; j--) {
                if (ar[j] > ar[j+1]) {
                    temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}

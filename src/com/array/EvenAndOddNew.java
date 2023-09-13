package com.array;

import java.util.Arrays;

public class EvenAndOddNew {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8, 9};
        // Print the resultant array
        System.out.println("Original Array: "
                + Arrays.toString(arr));
        int j = 0, k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                j++;
            } else {
                k++;
            }
        }

        int[] even = new int[j];
        int[] odd = new int[k];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[count] = arr[i];
                count++;
                System.out.println(even);
            } else {
                k++;
            }
        }
    }
}

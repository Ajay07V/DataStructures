package com.array;

import java.util.Arrays;

public class ArrangeRevWithoutArrayNew {
    public static void main(String[] args) {
        int[] ar = {1, 8, 6, 7, 8};
        int temp = 0;
        int p2 = ar.length - 1;
        for (int i = 0; i < p2; i++) {
            temp = ar[i];
            ar[i] = ar[ar.length - 1];
            ar[ar.length - 1] = temp;
            p2--;
            if (i == p2) {
                System.out.println(Arrays.toString(ar));
                break;
            }
        }

    }
}

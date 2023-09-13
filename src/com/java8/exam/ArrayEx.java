package com.java8.exam;

public class ArrayEx {
    public static void main(String[] args) {
        int[] ar1 = {2, 2, 3, 2, 9};
        int target = 5;
        for (int i = 0; i < ar1.length; i++) {
            for (int j = i+1; j < ar1.length ; j++) {
                int newTarget = ar1[i] + ar1[j];
                if (target == newTarget) {
                    System.out.println(i + " " + j);
                }
            }

        }
    }


}

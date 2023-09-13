package com.java8.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 7, 8, 9));
        int counter = 0;
        for (int i : list) {
            if (i > 1) {
                for (int num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
            }

        }

    }

}

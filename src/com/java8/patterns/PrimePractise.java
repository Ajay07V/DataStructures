package com.java8.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimePractise {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 2, 6, 9, 17, 79));
        List<Integer> primeList = numberList.stream().filter(PrimePractise::isPrimeNumber).collect(Collectors.toList());
        System.out.println(primeList);

    }
    public static boolean isPrimeNumber(Integer n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

        }
        return true;
    }
}

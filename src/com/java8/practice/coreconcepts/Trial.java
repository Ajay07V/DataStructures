package com.java8.practice.coreconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Trial {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2, 3, 4, 5, 7, 9));
        List<Integer> primeList = (list.stream().filter(Trial::isPrimes).collect(Collectors.toList()));
        System.out.println(primeList);
    }

    public static boolean isPrimes(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}

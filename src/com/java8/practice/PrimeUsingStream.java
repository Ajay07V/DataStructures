package com.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeUsingStream {

    public static boolean isPrime(int i) {
        IntPredicate isDivisible = new IntPredicate() {
            @Override
            public boolean test(int index) {
                return i % index == 0;
            }
        };
        return i > 1 && IntStream.range(2, i).anyMatch(isDivisible);
    }

    public static void main(String[] args) {

        //System.out.println(printPrime(200));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 23);
        // Prime number
        System.out.println(numbers.stream()
                .filter(PrimeUsingStream::isPrime)
                .collect(Collectors.toList()));
    }

}

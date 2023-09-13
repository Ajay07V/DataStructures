package com.java8.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> ar1=new ArrayList<>(Arrays.asList(1,2,3,4,5,5));
        List<Integer> ar2=new ArrayList<>(Arrays.asList(1,2,5));

        List<Integer> ar3=ar1.stream().distinct().filter(ar2::contains).collect(Collectors.toList());
        ar3.forEach((System.out::println));

        String ram="Ram";
        String vin="Ram";
        System.out.println(ram);
        System.out.println(vin);

    }
}

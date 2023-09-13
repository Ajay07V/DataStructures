package com.strings;

import java.util.HashMap;
import java.util.Map;

public class HashM {
    public static void main(String[] args) {
        HashMap<Integer, String> hp = new HashMap<>();
        hp.put(1, "ajay");
        hp.put(1, "Vijay");
        hp.put(2, "Ishan");
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Integer, String> entry : hp.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

    }
}

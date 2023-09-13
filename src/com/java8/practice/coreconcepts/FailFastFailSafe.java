package com.java8.practice.coreconcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastFailSafe {
    public static void main(String[] args) {
        HashMap<String, String> failFastMap = new HashMap<>();
        failFastMap.put("one", "ONE");
        failFastMap.put("two", "TWO");
        failFastMap.put("three", "Three");

        Iterator<Map.Entry<String, String>> failFastIterator = failFastMap.entrySet().iterator();
        System.out.println("Using entrySet()");
        while (failFastIterator.hasNext()) {
            System.out.println(failFastIterator.next());
            //when you try to modify the structure while you are traversing over object
            //  it will throw concurrentmodifiaction exception
            //put and remove methods throws exception but update will not
            failFastMap.put("four", "FOUR");
            System.out.println(" ");
        }

        Iterator<String> failFastKeySet = failFastMap.keySet().iterator();
        System.out.println("Using keySet()");
        //only keys will print
        while (failFastKeySet.hasNext()) {
            System.out.println(failFastKeySet.next());
            System.out.println(" ");
        }

        Iterator<String> failFastValueSet = failFastMap.values().iterator();
        System.out.println("Using values()");
        //only values will print
        while (failFastValueSet.hasNext()) {
            System.out.println(failFastValueSet.next());
            System.out.println(" ");
        }
    }
}
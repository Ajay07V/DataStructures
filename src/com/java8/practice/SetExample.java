package com.java8.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("ram");
        mySet.add("ram");

        System.out.println(mySet);

//using iterator
        Iterator<String> ss = mySet.iterator();
        while (ss.hasNext()) {
            System.out.println(ss.next());
        }
        // System.out.println(ss);
        //using for each
        for (String jo : mySet) {
            System.out.println(jo);
        }
    }
}

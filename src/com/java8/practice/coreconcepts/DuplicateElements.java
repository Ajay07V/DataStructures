package com.java8.practice.coreconcepts;

import jdk.jfr.Event;

import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> sampleList = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 6, 4, 2, 9, 6));
        //using linkedHashSet
      /* LinkedHashSet<Integer> sortedAndDistinct = new  LinkedHashSet<>();
        for (int i : sampleList) {
            sortedAndDistinct.add(i);
        }
          System.out.println(sortedAndDistinct);
    }*/
        //using plain java

        ArrayList<Integer> distictList = new ArrayList<>();
        for (int i:sampleList){
            if(distictList.contains(i)){
                distictList.add(i);
            }
        }
        System.out.println(distictList);
    }
}

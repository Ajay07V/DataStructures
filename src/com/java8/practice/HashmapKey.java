package com.java8.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapKey {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("ajay","kumar");
        map.put("ajay","ajay");
        for (Map.Entry<String,String> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
}

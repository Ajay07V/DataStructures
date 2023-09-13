package com.module2dsa.hashing;

import java.util.*;

public class FirstOccurringFrequency {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,5,3,4,3,5,6));
       HashSet<Integer> set=new HashSet<>();
        int occurredValue=0;
        for(int i=0;i<list.size();i++) {
            if (set.contains(list.get(i))) {
             //   map.put(list.get(i), map.get(list.get(i)) + 1);
                occurredValue= list.get(i);
                System.out.println(occurredValue);
            }
            else {
             //   map.put(list.get(i), 1);
            }
        }
          /*  if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }*/
            /*if(count==2){
                break;
            }*/

        /*for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/
    }
}

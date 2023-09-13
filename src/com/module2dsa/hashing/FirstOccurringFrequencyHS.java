package com.module2dsa.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FirstOccurringFrequencyHS {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,5,3,4,3,5,6));
       HashSet<Integer> set=new HashSet<>();
        int index=-1;
        for(int i=0;i<list.size();i++) {
            if (set.contains(list.get(i))) {
             //   map.put(list.get(i), map.get(list.get(i)) + 1);
                index=i;
              //  System.out.println(index);
            }
            else {
             set.add(list.get(i));
            }
            if (index != -1)
System.out.println(
                    "The first repeating element is "
                   + list.get(i));
else
System.out.println(
                   "There are no repeating elements");}
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

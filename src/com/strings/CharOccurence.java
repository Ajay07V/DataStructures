package com.strings;

import java.util.HashMap;

public class CharOccurence {
    public static void main(String[] args) {
        String s="AJAYAJAYAA";
        HashMap<Character,Integer> hp=new HashMap<>();
        //int count=1;
        for(int i=0;i<s.length();i++){
            if(hp.containsKey(s.charAt(i))){
                //get method fetches value using key as input
                int count=hp.get(s.charAt(i));
                count++;
                hp.put(s.charAt(i), count);

            } else {
                hp.put(s.charAt(i),1);
            }
        }
        System.out.println(hp);
    }
}

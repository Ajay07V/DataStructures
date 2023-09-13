package com.arraylist;

import java.util.ArrayList;

public class SampleList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<9;i++ ){
            list.add(i);
            i++;
        }
        for(int i:list){
            System.out.println(i);
        }

    }
}

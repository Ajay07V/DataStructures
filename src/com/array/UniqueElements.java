package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> res1 = new ArrayList<>();
        res1.add(1);

        int[] ar = {-61,-81};
        int val = 0;
        for (int i = 0; i < ar.length; i++) {
            val = ar[i];
            int freq = findFrequency(val, ar);
            if (freq == 1) {
                res.add(val);
            }

        }
       int arr[]=new int[res.size()];
        for(int i:res){
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int findFrequency(int val, int[] ar) {

        int freq = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == val) {
                freq++;
            }
        }
        return freq;
    }
}

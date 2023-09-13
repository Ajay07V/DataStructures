package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxElementEachRow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of 2D arrayList");
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            System.out.println("Enter the size of 1D arrayList");
            Scanner scanc = new Scanner(System.in);
            int m = scanc.nextInt();
            System.out.println("Enter the elements to the arrayList");
            for (int j = 0; j < m; j++) {

                int l = scanc.nextInt();
                al.add(l);
            }
            A.add(al);
        }
        ArrayList<Integer> sList = solve(A);
        System.out.println(sList);
    }

    private static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int rowLen=A.size();
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> newList=new ArrayList<>();
        for(int i=0;i<rowLen;i++){
            ArrayList<Integer> integers = A.get(i);
            for(int j=0;j< integers.size();j++){
               //  max= integers.get(j);
                if(max<= integers.get(j)){
                    max=integers.get(j);
                }
            }
            newList.add(max);
        }
        return newList ;
    }
}

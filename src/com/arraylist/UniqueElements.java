package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueElements {
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
            System.out.println(A);
        }
        ArrayList<ArrayList<Integer>> sList = solve(A);
        System.out.println(sList);

    }

    private static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int len=A.size();
        ArrayList<ArrayList<Integer>>newList= new ArrayList<>();
        for(int i=0;i<len;i++) {
            ArrayList<Integer> list = A.get(i);
            ArrayList<Integer> updatedList=new ArrayList<>();

            for(int j:list){
                 int freq=calculateFreq(list,j);
                 if(freq==1){
                    updatedList.add(j);
                 }

            }
             newList.add(updatedList);
        }
        return newList;
    }

    private static int calculateFreq(ArrayList<Integer> list, int j) {
        int freq=0;
        for(int k:list){
            if(k==j){
               freq++;
            }
        }
        return freq;
    }
}

package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEvenTwoD {
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
        int n = A.size();
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> integers = A.get(i);
            for (int j = 0; j < integers.size(); j++) {
                if (integers.get(j) % 2 == 0) {
                    list.add(integers.get(j));
                }
            }
            newList.add(list);
        }


        return newList;
    }
}

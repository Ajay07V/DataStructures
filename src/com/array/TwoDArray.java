package com.array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[][] ar = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                ar[i][j] = scan.nextInt();
            }
        }
        //to print single row
        int length = ar[0].length;
        for (int i = 0; i < length; i++) {
            System.out.print(ar[0][i] + " ");
        }
        System.out.println();
        System.out.println(ar.length);
        int C = 0;
        //to print single column
        for (int i = 0; i < N; i++) {

            System.out.print(ar[i][C] + " ");
        }
        System.out.println();
        int coulmnLen = ar[0].length;
        //to print single row
        for (int i = 0; i < coulmnLen; i++) {

            System.out.print(ar[0][i] + " ");
        }
        System.out.println();
        //To print all the columns
        System.out.println("To print all the columns");
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                System.out.print(ar[j][i] + " ");
            }
            System.out.println();
        }
        //print columns in a waved manner
        int colLength = ar[0].length;
        int rowLength = ar.length;
        System.out.println();
        System.out.println("Column waved manner");
        for (int i = 0; i < colLength; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < rowLength; j++) {
                    System.out.print(ar[j][i] + " ");
                }
                System.out.println();
            } else {
                for (int j = rowLength - 1; j >= 0; j--) {
                    System.out.print(ar[j][i] + " ");
                }
                System.out.println();
            }
            //print the sum of an array index of particular row

        }
        System.out.println("print the sum of an array index of particular row & column");

        TwoDArraySum sum = new TwoDArraySum();
        sum.sum(ar);
        System.out.println("Finding the max number in a row");
        MaxNumInEachRow maxR = new MaxNumInEachRow();
        maxR.findMaxInEachRow(ar);

    }

}

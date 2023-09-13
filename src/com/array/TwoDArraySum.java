package com.array;

import java.util.Scanner;

public class TwoDArraySum {

    public void sum(int[][] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the row index");
        int rowIndex = scan.nextInt();
        System.out.println("enter the column index");
        int colIndex = scan.nextInt();
        calculateSumRow(ar, rowIndex);
        calculateSumColumn(ar, colIndex);
    }

    private void calculateSumColumn(int[][] ar, int colIndex) {
        System.out.println("calculateSumColumn for " + colIndex);
        int rowLength = ar.length;
        int sum = 0;
        for (int i = 0; i < rowLength; i++) {
            sum = sum + ar[i][colIndex];
        }
        System.out.println(sum);

    }

    private void calculateSumRow(int[][] ar, int index) {

        System.out.println("calculateSumRow for " + index);
        int colLength = ar[0].length;
        int sum = 0;
        for (int i = 0; i < colLength; i++) {
            sum = sum + ar[index][i];
        }
        System.out.println(sum);

    }
}

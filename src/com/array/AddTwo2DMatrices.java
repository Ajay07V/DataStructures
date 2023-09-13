package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwo2DMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No OF Rows Required");
        int N = scan.nextInt();
        System.out.println("Enter No OF Columns Required");
        int M = scan.nextInt();
        System.out.println("Enter the matrix values");
        int[][] ar = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                ar[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the matrix values");
        int[][] br = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                br[i][j] = scan.nextInt();
            }
        }
        int[][] cr = addTwoMatrices(ar, br);
        for (int i = 0; i < cr.length; i++) {
            for (int j = 0; j < cr[0].length; j++) {
                System.out.print(cr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] addTwoMatrices(int[][] ar, int[][] br) {
        int rowLen = ar.length;
        int colLen = ar[0].length;
        int[][] cr = new int[rowLen][colLen];
        if (ar.length == br.length && ar[0].length == br[0].length) {
            for (int i = 0; i < rowLen; i++) {
                for (int j = 0; j < colLen; j++) {
                    cr[i][j] = ar[i][j] + br[i][j];
                }
            }
        }
       return cr;
    }
}

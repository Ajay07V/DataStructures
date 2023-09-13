package com.array;

import java.util.Scanner;

public class TransposeOf2DMatrix {
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
       int [][]cr= transposeOfAMatrix(ar);
        for (int i = 0; i < cr.length; i++) {
            for (int j = 0; j < cr[0].length; j++) {
                System.out.print(cr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transposeOfAMatrix(int[][] ar) {
        int rowLen= ar.length;
        int colLen=ar[0].length;
        int cr[][]=new int[colLen][rowLen];
        for(int i=0;i<colLen;i++){
            for(int j=0;j<rowLen;j++){
                cr[i][j]=ar[j][i];
            }
        }
        return cr;
    }
}

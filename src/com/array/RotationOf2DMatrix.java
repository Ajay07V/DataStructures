package com.array;

import java.util.Scanner;

public class RotationOf2DMatrix {
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
     int cr[][] =  rotationOfMatrix(ar);
        for (int i = 0; i < cr.length; i++) {
            for (int j = 0; j < cr[0].length; j++) {
              System.out.print(cr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] rotationOfMatrix(int[][] ar) {
        int rowLen=ar.length;
        int colLen=ar[0].length;
        int cr[][]=new int[rowLen][colLen];
       for(int j=0;j<colLen;j++){
           for(int i=rowLen-1;i>=0;i--){
               System.out.println(ar[i][j]);
           }
       }
        return ar;
    }
}

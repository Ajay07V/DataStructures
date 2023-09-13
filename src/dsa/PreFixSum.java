package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class PreFixSum {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 6, 7, 9};
        int rows = 4;
        int columns = 2;
        int[][] Q = new int[rows][columns];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Q[i][j] = scan.nextInt();
            }
        }
        int pfSum[]=new int[a.length];
        int sum=0;
        //creating prefix sum
        //assigning a[0] to pf[0]---
        pfSum[0]=a[0];
        for(int i=1;i<a.length;i++){
            pfSum[i]=pfSum[i-1]+a[i];
        }
        int ar[]=new int[Q.length];
        for(int i=0;i< Q.length;i++){
            //getting queries from 2d array eg:2 To 5
            int l=Q[i][0];
            int r=Q[i][1];
            if(l==0){
                sum=pfSum[r];
            }
            else {
                sum=pfSum[r]-pfSum[l-1];
            }
            //sums ar adding into the array
            ar[i]=sum;
        }
        System.out.println(Arrays.toString(ar)+" ");
    }
}

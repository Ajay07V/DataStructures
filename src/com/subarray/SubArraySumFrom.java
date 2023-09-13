package com.subarray;

public class SubArraySumFrom {
    public static void main(String[] args) {
        int ar[]={1,5,6,7,8,3,5,6};
       // int br[][]={{1,2},{1,4},{2,4}};
       // int l=3;int m=5;
        int finalSum=0;
        for(int i=0;i<ar.length;i++){//start index
            int subArraySum=0;
            for(int j=i;j< ar.length;j++) {//end index
                subArraySum = subArraySum + ar[j];
               // System.out.println(initialSum);
            }
            finalSum=finalSum+subArraySum;
        }
        System.out.println(finalSum);

    }
}

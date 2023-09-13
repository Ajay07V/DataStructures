package com.subarray;

public class MaxSubArray {
    public static void main(String[] args) {
        int ar[]={1,5,-6,7,-2,5,6};
        //kadane's algorithm
        int sum=ar[0];
        int ans=ar[0];
        for(int i=1;i< ar.length;i++){
            if(sum<0){
                //making the sum=0 and then adding to ar[i]
                sum=0;
            }
            sum=sum+ar[i];
            if(sum>ans){
                ans=sum;
            }
        }
        System.out.println(sum);
    }
}

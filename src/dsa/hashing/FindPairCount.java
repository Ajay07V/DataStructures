package dsa.hashing;
/*You are given an array A of N integers and an integer B. Count the number of pairs (i,j) such that A[i] + A[j] = B and i ≠ j.
Since the answer can be very large, return the remainder after dividing the count with 109+7.
Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.*/

import java.util.HashMap;

public class FindPairCount {
    public static void main(String[] args) {
        int a[]={2,5,2,5,8,5,2,8};
        int k=10;
       int pairs= findNumberOfPairs(a,k);
        System.out.println(pairs);
    }

    private static int findNumberOfPairs(int[] A, int B) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(B-A[i])){
                count=count+map.get(B-A[i]);
            }
            if(map.containsKey(A[i])){
                int frequency=map.get(A[i]);
                frequency=frequency+1;
                map.put(A[i],frequency);
            }
            else {
                map.put(A[i],1);
            }

        }
        return count;
    }
}

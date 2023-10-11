package dsa.hashing;
/*Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j*/


import java.util.HashSet;

public class FindPairMatchesK {
    public static void main(String[] args) {
        int A[]={1,2,6,6,2};
        int k=8;
       boolean present= isPairPresent(A,k);
        System.out.println(present);
    }

    private static boolean isPairPresent(int[] A, int k) {
        HashSet<Integer> hSet=new HashSet<>();
        int n=A.length;
        for(int i=0;i<n;i++){
            if(!hSet.contains(A[i])){
                hSet.add(A[i]);
            }
            if(hSet.contains(k-A[i])){
               return true;
            }
        }
        return false;
    }
}

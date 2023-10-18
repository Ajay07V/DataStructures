package dsa.hashing;

import java.util.HashSet;

public class CheckSubArraywithSumK {
    public static void main(String[] args) {
        int a[]={2,-1,3,-2,1,2};
        int k=4;
        boolean present=checkSubArraywithK(a,k);
        System.out.println(present);
    }

    private static boolean checkSubArraywithK(int[] a, int k) {
        int prefixSum=0;
        HashSet<Integer> set=new HashSet<>();
        set.add(0);
        for(int i=0;i< a.length;i++){
            prefixSum=prefixSum+a[i];
            set.add(prefixSum);
            if(set.contains(k-prefixSum)){
                return true;
            }

        }
        return false;

    }
}

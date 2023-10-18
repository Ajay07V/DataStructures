package dsa.hashing;
/*Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j*/
/*>Suppose a case like this [3, 5] and A = 6

>Now when i equal to 0 you will add 3 in your hashset and then you will check if 6 - 3 = 3 is present in hSet.

>And this will true and you will return 1. But this will be wrong. As you considering same 3 as pair.

>So, correct approach will b

e move line 9 if condition before line 6 if condition.*/

import java.util.HashSet;

public class FindPairMatchesK {
    public static void main(String[] args) {
        int[] A = {9, 71, 45, 95, 55, 78, 85, 1, 43, 57, 16, 68, 15, 1, 0, 51};
        int k = 9;
        boolean present = isPairPresent(A, k);
        System.out.println(present);
    }

    private static boolean isPairPresent(int[] A, int k) {
        HashSet<Integer> hSet = new HashSet<>();
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (hSet.contains(k - A[i])) {
                return true;
            }

            hSet.add(A[i]);
        }

        return false;
    }
}

package dsa.hashing;
/*Given an array A of N integers.
Find the length of the longest subarray in the array which sums to zero.
Note :
while we A[i] multiple times, it may cross the range of integer, so wisely select data type for any operations.
1 <= N <= 10^5
-10^9 <= A[i] <= 10^9
*/

import java.util.HashMap;

public class LargestSubArraySumZ {
    public static void main(String[] args) {
        int[] a = {2, 3, 3, -6, 3, 3, -6, 6, -3, 4, -4};
        int length = getLongestSubArraySumZero(a);
        System.out.println(length);

    }

    private static int getLongestSubArraySumZero(int[] a) {
        int maxLength = 0;
        long prefixSum=0 ;
        int n = a.length;
        HashMap<Long, Integer> hMap = new HashMap<>();
        hMap.put(0L, -1);//for edge case if prefix sum produces value zero and hashMap contains somewhere only 1 zero
        //to compensate that
        for (int i = 0; i < n; i++) {
            prefixSum =prefixSum +a[i];
            if (!hMap.containsKey(prefixSum)) {
                hMap.put(prefixSum, i);
            } else {
                //if hashmap contains the value that exists previously in that case there is a subarray with sum zero exists
                //calculating maxLength by getting the new index from array and index stored previously with that value
                //Updating the value of maxLength
                maxLength = Math.max(maxLength, i - hMap.get(prefixSum));

            }

        }


        return maxLength;
    }
}
/*
* Time Complexity O(n)
* Space Complexity O(n)
* */

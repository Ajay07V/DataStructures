package dsa.subarray;

public class SubArraySumLengthKPrefix {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6, 7};
        int k = 3;
        int maxSubArraySum = getMaxSum(a, k);
        System.out.println("Max sub array sum with length given is " + maxSubArraySum);
    }

    private static int getMaxSum(int[] a, int k) {
        int[] prefix = new int[a.length];
        int n = a.length;
        int maxSubArraySum = Integer.MIN_VALUE;
        prefix[0] = a[0];
        //creating prefix sum
        for (int i = 1; i < a.length; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        //initial subarray starts from 0 to k-1
        int start = 0, end =k-1;
        while (end < n) {
            int currentSum;
            if (start == 0) {
                currentSum = prefix[end];
            } else {
                currentSum = prefix[end] - prefix[start - 1];

            }
            if (currentSum > maxSubArraySum) {
                maxSubArraySum = Math.max(currentSum, maxSubArraySum);
                start++;
                end++;
            }
        }

        return maxSubArraySum;
    }
}

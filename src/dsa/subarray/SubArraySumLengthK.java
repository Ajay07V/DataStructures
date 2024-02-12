package dsa.subarray;
//BruteForce method
public class SubArraySumLengthK {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 6, 2, 1};
        int k = 3;
        int maxSum = getMaximumSubArraySum(a, k);
        System.out.printf("max sub array sum " + maxSum);
    }

    private static int getMaximumSubArraySum(int[] a, int k) {
        int maxSubArraySum = Integer.MIN_VALUE;
        for (int i = 0; i <= a.length-k; i++) {
            int currentSum = 0;
            for (int j = i; j< k + i; j++) {
                currentSum = currentSum + a[j];
            }
            if (currentSum > maxSubArraySum) {
                maxSubArraySum = currentSum;
            }
        }
        return maxSubArraySum;
    }
}

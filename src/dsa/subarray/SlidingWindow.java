package dsa.subarray;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] a = {3, 4, -2, 5, 3, -2, 8, 2, 1, 4};

        int k = 6;
        int i1 = calculateMaxSumInSubArray(a, k);
        System.out.println(i1);
    }

    private static int calculateMaxSumInSubArray(int[] a, int k) {
        int s = 0;
        int e = k ;
        int n = a.length;
        int ans = Integer.MIN_VALUE;
        int sum=0;
        for (int i = s; i <e; i++) {
           // int sum = 0;
            sum = sum + a[i];
            if (ans < sum) {
                ans = sum;
            }
        }
            s = 1;
            e = k;
            while (e < n) {
                //int sum2 = 0;
                sum = sum - a[s - 1]+a[e];

                if (ans < sum) {
                    ans = sum;
                }
                s++;
                e++;
            }
        return ans;
            //Time Complexity for first loop is 'k'
        //Time complexity for while loop is 'n-k' as one time is iterated already otherwise it would be n-k+1
        //TC=k+(n-k)
        }
}

package dsa.search;

public class MaximaInUnsortedArray {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 7, 9, 0};
        int maxima = getMaxima(a);
        System.out.println(maxima);
    }

    private static int getMaxima(int[] a) {
        int n = a.length;
        //if array has only one element
        if (n == 1) {
            return a[0];
        }
        //if first element is greater than second element then first element will be maxima
        if (a[0] > a[1]) {
            return a[0];
        }
        //if last element is greater than last second element then last element will be maximum
        if (a[n - 1] > a[n - 2]) {
            return a[n - 1];
        }
        //as we considered a[0] and a[n-1] edge cases before, so we started from the l=1 and r =n-2
        int l = 1, r = n - 2;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid - 1] < a[mid] && a[mid] > a[mid + 1]) {
                return a[mid];
            }
            //potential loss in left
            else if (a[mid - 1] < a[mid] && a[mid] < a[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}

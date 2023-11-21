/*Given an array of integers A, find and return the peak element in it.
An array element is considered a peak if it is not smaller than its neighbors.
 For corner elements, we need to consider only one neighbor.*/


package dsa.sorting;

public class OnePeakElement {
    public static void main(String[] args) {
        int[] a = {5, 2, 3, 6, 7};
        int peakElement = getPeakElement(a);
        System.out.println(peakElement);

    }

    private static int getPeakElement(int[] a) {
        int n = a.length;
        int l = 1;
        int r = a.length - 2;
        int max = Integer.MAX_VALUE;
        //edge case with single element and the array in which oth index value is greater than 1st index value
        if (a.length == 1 || a[0] >= a[1]) {
            return a[0];
        }
        //edge case where last element is greater
        if (a[n - 1] >= a[n - 2]) {
            return a[n - 1];
        }


        while (l <= r) {
            int mid = (l + r) / 2;

            if (a[mid] >= a[mid - 1] && a[mid] >= a[mid + 1]) {
                max = a[mid];
                return max;
            }


            if (a[mid] < a[mid - 1]) {
                r = mid - 1;
            } else {
                l = mid + 1;

            }
        }
        return max;
    }
}

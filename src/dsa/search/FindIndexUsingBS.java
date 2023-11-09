/*Given a sorted array of integers A (0-indexed) of size N, find the left most and the right most index of a given integer B in the array A.

Return an array of size 2, such that
          First element = Left most index of B in A
          Second element = Right most index of B in A.
If B is not found in A, return [-1, -1].

Note : Your algorithm's runtime complexity must be in the order of O(log n).*/


package dsa.search;

import java.util.Arrays;

public class FindIndexUsingBS {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 0};
        int target = 5;
        int[] result = findLeftAndRightMostIndex(a, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findLeftAndRightMostIndex(int[] a, int target) {
        //create an array with length 2 as we have only two target indexes
        int[] result = new int[2];
        int leftMostIndex = findLeftMostIndex(a, result, target);
        int rightMostIndex = findRightMostIndex(a, result, target);
        result[0] = leftMostIndex;
        result[1] = rightMostIndex;
        return result;
    }

    private static int findRightMostIndex(int[] a, int[] result, int target) {
        int l = 0, r = a.length - 1;
        int index = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == target) {
                //storing index where target occurs
                index = mid;
                //updating index value by traversing to the right until last element is target
                l = mid + 1;
            }
            if (a[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return index;
    }

    private static int findLeftMostIndex(int[] a, int[] result, int target) {
        int l = 0, r = a.length - 1;
        int index = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == target) {
                //storing index where target occurs
                index = mid;
                //updating index value by traversing to the left until last element is target
                r = mid - 1;
            }
            if (a[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return index;
    }
}

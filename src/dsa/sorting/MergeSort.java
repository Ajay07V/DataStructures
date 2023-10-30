package dsa.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 7, 9};
        int[] b = {2, 4, 5, 10};
        sortUsingMergeSort(a, b);
    }

    private static void sortUsingMergeSort(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0, k = 0;
        int[] c = new int[n + m];
        while (i < n && i < m) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }

        }
        while (i < n) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            c[k] = b[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(c));

    }
}

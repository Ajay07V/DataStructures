package dsa.sorting;

import java.util.Arrays;
/*Sort last element in correct position where n-1 elements are sorted*/

public class SortLastElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 9, 10, 7};
        sortLastElement(arr);
    }

    private static void sortLastElement(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] >arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

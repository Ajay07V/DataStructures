package FreshPractice;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(reverseAnArray(a)));

    }

    private static int[] reverseAnArray(int[] a) {

        int temp = 0;
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;

        }
        return a;
    }
}

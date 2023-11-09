package FreshPractice;

import java.util.Arrays;

public class RotationOfArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5};
        int k = 2;
        int[] rotatedArray = rotateArray(a, k);
        System.out.println(Arrays.toString(rotatedArray));

    }


    private static int[] rotateArray(int[] a, int k) {
        int temp = 0;
        int left = 0;
        int right = (a.length ) - k;
        System.out.println(a[right]);
        int j = 0;
        while (j <k) {
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            j++;
            left++;
            right++;
        }
        return a;
    }
}

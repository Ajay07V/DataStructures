package dsa.sorting;

import java.util.Scanner;

public class SortedInsertPosition {
    public static void main(String[] args) {
        int[] a = {1, 5, 6, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int B = scanner.nextInt();
        int position = insertPosition(a, B);
        System.out.println("Position at which number to be inserted: " + position);

    }

    private static int insertPosition(int[] a, int B) {

        int n = a.length;
        int l = 0;
        int r = a.length - 1;
        int index = -1;
        //if it has only one element
        if (n == 1) {
            return 0;
        }
        //if last element is less than or equal to B
        if (a[n - 1] <= B) {
            return n;
        }
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == B) {
                return mid;
            } else if (a[mid] < B) {
                l = mid + 1;
                //index=mid;

            } else {
                r = mid - 1;
                index = mid;
            }

        }
        return index;

    }
}

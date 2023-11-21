package dsa.sorting;

import java.util.Scanner;

public class FindElementInRotatedMatrix {
    public static void main(String[] args) {
        int[] a = {1,7,67,133,178};
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int index = getIndexInRotatedSortedMatrix(a, k);
        System.out.println("index "+index);
    }

    private static int getIndexInRotatedSortedMatrix(int[] a, int k) {
        int n = a.length;
        int l = 0;
        int r = n - 1;
        if (a[0]==k||n == 1 && k == a[0]) {
           return 0;
        }
        while (l <= r) {
            int mid = (l + r) / 2;

            if(a[mid]==k){
                return mid;
            }
            if (a[l] <= a[mid]) {
                if (k > a[l] && k < a[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }

            } else {
                if (k > a[mid] && k < a[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }

            }
        }
        return -1;
    }
}

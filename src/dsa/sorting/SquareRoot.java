package dsa.sorting;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 8, 9, 11, 13, 15};
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int squareRoot = findSquareRoot(a, k);
        System.out.println(squareRoot);
    }

    private static int findSquareRoot(int[] a, int k) {
        int n = a.length;
        int l = 0;
        int r = n - 1;
        int value=-1;
        if (n == 1 && a[0] < k) {
            return a[0];
        }
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid]*a[mid]==k){
                return a[mid];
            }
            else if(a[mid]*a[mid]<k){
                l=mid+1;
                value=a[l];

            }
            else {
                r=mid-1;
            }

        }
        return value;
    }
}

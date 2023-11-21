package dsa.sorting;

import java.util.Scanner;

public class SquareRootFloor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("enter required number: "+n);
        int sRoot = getSquareRootOrFloor(n);
        System.out.println(sRoot);

    }

    private static int getSquareRootOrFloor(int n) {
        int l = 1, r = n;
        int value = 0;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                l = mid + 1;
            } else {
                r = mid - 1;
                value = r;
            }

        }
        return value;
    }
}

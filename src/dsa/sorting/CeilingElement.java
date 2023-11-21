/*Given a sorted array B of integers of size A, and a integer value C,
 return the ceiling of C which is present in array B*/
package dsa.sorting;

import java.util.Scanner;

public class CeilingElement {
    public static void main(String[] args) {
        int[] B = {2, 5, 6, 9, 18};
        int A = B.length;
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        int ceilElement = getCeilElement(A, B, C);
        System.out.println(ceilElement);
    }

    private static int getCeilElement(int A, int[] B, int C) {
        int n = B.length;
        int l = 0;
        int r = n - 1;
        int value = -1;
        //edge case
        if (n == 1 && C <= B[0]) {
            return B[0];
        }
        while (l <= r) {
            int mid = (l + r) / 2;
            //where B[mid]==C
            if (B[mid] == C) {
                return B[mid];
            } else if (B[mid] < C) {
                l = mid + 1;
                value = B[l];

            } else {
                r = mid - 1;
            }
        }
        return value;
    }
}

package dsa.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 7, 8, 9};
        int k = 7;
        int index = findElementUsingBinarySearch(a, k);
        System.out.println(index);

    }

    private static int findElementUsingBinarySearch(int[] a, int k) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (k == a[mid]) {
                return mid;
            }
            if (a[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

}

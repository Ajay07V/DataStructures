package dsa;

public class BulbSwitchOn {
    public static void main(String[] args) {
        int count = 0;
        int[] ar = {1, 1, 0, 0, 1, 0, 1};
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == count%2) {
                count++;
            }
        }
        System.out.println(count);
    }
}

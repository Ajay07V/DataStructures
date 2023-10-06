package dsa.hashing;

import java.util.ArrayList;
import java.util.Arrays;

/*Given an Array A. You have some integers given in the array B
 * For the i-th number, find the frequency of B[i] in the array A
 * and return a list containing all the frequencies */
public class FrequencyUsingDataStructure {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 4, 5, 6, 2, 4, 55, 6, 9));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 4, 8, 6));
        ArrayList<Integer> D = new ArrayList<>();
        for (int i = 0; i < B.size(); i++) {
            int C = B.get(i);
            int frequency = getFrequency(A, C);
            System.out.println(frequency);
            D.add(frequency);
        }


    }

    private static int getFrequency(ArrayList<Integer> a, int c) {
        int frequency = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == c) {
                frequency++;
            }
        }
        return frequency;
    }
}


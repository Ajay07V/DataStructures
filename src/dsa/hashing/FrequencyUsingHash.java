package dsa.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FrequencyUsingHash {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 4, 5, 6, 2, 4, 55, 6, 9, 1));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 4, 8, 6));
        ArrayList<Integer> D = new ArrayList<>();
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if (hMap.containsKey(A.get(i))) {
                Integer value = hMap.get(A.get(i));
                hMap.put(A.get(i), value + 1);
            } else {
                hMap.put(A.get(i), 1);
            }
        }

        for (int i = 0; i < B.size(); i++) {
            int length = B.size();
            int frequency = getFrequency(hMap, B.get(i), length);
            D.add(frequency);
        }
        for (int j : D) {
            System.out.println(j + " ");
        }


    }

    private static int getFrequency(HashMap<Integer, Integer> hMap, Integer integer, int length) {
        if (hMap.containsKey(integer)) {
            int frequency = hMap.get(integer);
            return frequency;
        } else {
            return 0;
        }
    }
}



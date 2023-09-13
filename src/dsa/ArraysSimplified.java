package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysSimplified {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        List<Integer> reverse = reverse(list, start, end);
        for (int i : reverse) {
            System.out.println(i);
        }
    }

    private static List<Integer> reverse(List<Integer> list, int start, int end) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i <start; i++) {
            newList.add(list.get(i));
        }
        for (int i = end; i >=start; i--) {
            newList.add(list.get(i));
        }
        for (int i = end+1; i < list.size(); i++) {
            newList.add(list.get(i));
        }
        return newList;
    }
}

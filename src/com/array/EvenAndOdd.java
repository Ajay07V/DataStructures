package com.array;

/*create a an array from given array that should store even number first and odd number*/
public class EvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 8, 60, 43};
        evenAndOdd(arr);

    }

    public static void evenAndOdd(int[] arr) {
        //creating a new array of same length
        int[] arr1 = new int[arr.length];
        int index = 0;
        //even number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr1[index] = arr[i];
                index++;
            }
        }
        //odd number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr1[index] = arr[i];
                index++;
            }
        }
        for (int i=0;i< arr1.length;i++) {
            System.out.println(arr1[i]+",");
        }

    }
}

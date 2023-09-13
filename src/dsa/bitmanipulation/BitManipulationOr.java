package dsa.bitmanipulation;

import java.util.Scanner;

public class BitManipulationOr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Integer");
        int n = scan.nextInt();
        System.out.println("Enter the ith bit position");
        int i = scan.nextInt();
        //make ith bit in N set if ith bit is set leave as it is otherwise set it.
        n = (n | (1 << i));
        System.out.println(n);
    }
}

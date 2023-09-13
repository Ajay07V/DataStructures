package dsa;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        //to check 0th bit is Set or not
       /* if((n>>1&1)==1){
            System.out.println("Set");
        }
        else {
            System.out.println("not a set");
        }*/
        int count=0;
        while(n>0){
            if((n>>1&1)==1) {
                count++;
            }
                n=n>>1;


        }
        System.out.println(count);
    }
}

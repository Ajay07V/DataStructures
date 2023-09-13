package com.java8.practice.coreconcepts;

public class FinallyUsage {
    public static void main(String[] args) {
      //  System.exit(0);
        try {
          //  System.exit(0);
            int c = 5 / 0;
            System.out.println(c);
            System.out.println("try block");
            System.exit(0);
        }
        catch (Exception e){
            System.out.println("Catch Block");

        }
        finally {
            System.out.println("finally block");

        }
    }

}

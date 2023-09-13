package com.java8.anonymous;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ar = scan.nextInt();
        Calculation calculation = new Calculation() {

            @Override
            public int calculateArea(int ar) {
                int area = ar * ar;
                System.out.println(area);
                return area;
            }
        };
        calculation.calculateArea(ar);
        //lamda expression

        Calculation calculations = (ar1 -> {
            int area = ar * ar;
            System.out.println(area);
            return area;
        }
        );
        calculations.calculateArea(ar);
      //method referewnce
        Calculation calculate= calculation::calculateArea;
        calculate.calculateArea(ar);

    }
}

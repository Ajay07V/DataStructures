package com.calculator;

import java.util.Scanner;

public class ScienceCal {


    public static void main(String[] args) {
        // local variables & datatype
        double num1, num2, result = 0, degree;
        // to read inputs from console
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1");

        num1 = sc.nextDouble();
        System.out.println("Enter num2");
        num2 = sc.nextDouble();

        System.out.println("Enter Operator");
        char Operator = sc.next().charAt(0);

        // switch case
        try {
            switch (Operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("Entered Operator is wrong");
                    return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(num1 + "  " + Operator + "  " + num2 + ":result is:" + result);
    }
}

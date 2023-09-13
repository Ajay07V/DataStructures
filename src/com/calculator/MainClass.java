package com.calculator;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner NumInput = new Scanner(System.in);
        double firstNum;
        double secondNum;
        double result = 0;
        System.out.println("Enter first number: ");
        firstNum = NumInput.nextDouble();
        System.out.println("Enter operator: ");
        String operator = NumInput.next();
        if (operator.equals("sin") || operator.equals("cos") || operator.equals("tan") || operator.equals("cot")) {
            try {
                switch (operator) {
                    case "sin":
                        result = Math.sin(firstNum);

                        break;
                    case "cos":
                        result = Math.cos(firstNum);
                        break;
                    case "tan":
                        result = Math.tan(firstNum);
                        break;
                    case "cot":
                        result = Math.cos(firstNum) / Math.sin(firstNum);
                        break;

                    default:
                        break;


                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Math.toRadians(result));
        } else

            System.out.println("Enter second number: ");
        secondNum = NumInput.nextDouble();
        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;

            default:
                System.out.println("Invalid Number");
        }

        System.out.println(result);

    }
}

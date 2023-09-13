package com.java8.practice;

public class Lamda {
    public static void main(String[] args) {
        Lamda operator = new Lamda();

        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (int a, int b) -> a - b;
        MathOperation division = (int a, int b) -> a / b;
        System.out.println(operator.checkSum(5, 7, addition));


    }

    private int checkSum(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }

    public interface MathOperation {
        int operate(int a, int b);
    }
}

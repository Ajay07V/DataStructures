package com.java8.practice;

public class Vole {
    public volatile int i = 5;

    public void increment() {

        for (int j = 0; j < i; j++) {
            i--;
        }
    }

    public void decrement() {

        for (int j = 0; j < i; j++) {
            i++;
        }
    }
}

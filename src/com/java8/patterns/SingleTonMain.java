package com.java8.patterns;

public class SingleTonMain {

    public static void main(String[] args) {
      System.out.println(SingleTonPattern.getInstance().getValue(5));
    }
}

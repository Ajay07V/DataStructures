package com.java8.practice.coreconcepts;

public class ConstantPool {
    public static void main(String[] args) {
        String s1 = new String("Ram");
        String s2 = new String("Ram");
        StringBuffer s3 = new StringBuffer("Ram");
        StringBuffer s4=new StringBuffer("Ram");
        System.out.println(s3==s4);
        System.out.println(s3.toString().equals(s4.toString()));

    }
}

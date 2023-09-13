package com.strings;

public class CompareObj {
    public static void main(String[] args) {
        String s1 = "Vijay";
        String s2 = "Vijay";
        if (s1.equals(s2)) {
            System.out.println("Content is same");
        }
        if (s1 == s2) {
            System.out.println("Ref are same");
        }
        String s3 = new String("Vijay");
        String s4 = new String("Vijay");
        if (s1.equals(s3)) {
            System.out.println("s1,s3 are Equal");
        }
        if (s3.equals(s4)) {
            System.out.println("s4,s3 are Equal");
        }
        if (s1 == s3) {
            System.out.println("s1,s3 ref are equal");
        }
        if (s3 == s4) {
            System.out.println("s3 and s4 references are equal");
        }
        StringBuffer s5 = new StringBuffer("Vijay");
        StringBuffer s6 = new StringBuffer("Vijay");
        if (s5.equals(s6)) {
            System.out.println("S5 and S6 are equal");
        }
        if(s5==s6){
            System.out.println("S5 and S6 ref are equal");
        }
        StringBuilder s7 = new StringBuilder("Vijay");
        StringBuilder s8 = new StringBuilder("Vijay");
        if (s7.equals(s8)) {
            System.out.println("S7 and S8 are equal");
        }
        if(s7==s8){
            System.out.println("S7 and S8 ref are equal");
        }
//       boolean value= returnCondition(s1,s3);
//        System.out.println(value);

    }

    private static boolean returnCondition(String s, String s1) {
        if (s1.equals(s)) {
            System.out.println("Equals method():");
            return true;
        } else if (s == s1) {
            System.out.println("Ref method():");
            return true;
        } else
            return false;

    }
}


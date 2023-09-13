package com.java8.practice;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        /*System.out.println(isAvail("Ram@768"));*/
        System.out.println(isAvail.test("Ram@768"));
    }


    /* static boolean isAvail(String pwd) {
         if (pwd.length() >= 5 && pwd.length() <= 10) {
             return true;
         }
         else
         {
             return  false;
         }
     }*/

    static Predicate<String> isAvail=(pwd)->pwd.length()>=5&&pwd.length()<=10;
}

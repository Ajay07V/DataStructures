package com.java8.practice;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {

      /*  FunctionEx functionEx = new FunctionEx();
        int incr = functionEx.increment(1);
        System.out.println(incr);*/
        Integer apply = declarative.apply(1);
        System.out.println(apply);
        Integer multi = multiply.apply(1);
        System.out.println(multi);
        Function<Integer, Integer> integerIntegerFunction = declarative.andThen(multiply);
        System.out.println(integerIntegerFunction.apply(1));
        System.out.println( biFunction.apply(2,5));


    }

    //Imperative appraoch
    public int increment(int number) {
        return number + 1;
    }

    //Declarative approach
    static Function<Integer, Integer> declarative = numbers -> numbers+1;

    static Function<Integer, Integer> multiply = numbers -> numbers * 10;

    static BiFunction<Integer,Integer,Integer> biFunction=(x1,x2)->(x1+x2)*10;

}



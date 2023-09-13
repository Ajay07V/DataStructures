package com.java8.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        normal(7);
        consume.accept(7);
        Consumer<List<Integer>> modify=list->{
            for(int i=0;i<list.size();i++)
                list.set(i, list.get(i)*2);
         };
        Consumer<List<Integer>>dispay=list->list.stream().forEach(System.out::println);
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        modify.andThen(dispay).accept(list);

    }

    //imperative
    static void normal(int number) {
        int i = ++number;
        System.out.println(i);

    }
    //declarative
     static Consumer<Integer> consume= num-> System.out.println(++num);

}

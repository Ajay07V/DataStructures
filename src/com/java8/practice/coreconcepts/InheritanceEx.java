package com.java8.practice.coreconcepts;

interface ParentOne {
    void eat();
}

interface ParentTwo {
    void eat();
}

public class InheritanceEx {


    public static void main(String[] args) {
        ParentOne c = new Child();
        c.eat();
    }

}

class Child implements ParentOne, ParentTwo {

    @Override
    public void eat() {
        System.out.println("children are eating");

    }
}
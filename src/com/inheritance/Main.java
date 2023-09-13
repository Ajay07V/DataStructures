package com.inheritance;

public class Main {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.eat();

    }
}

class Animal {
    public void eat() {
        System.out.println("Every animal can eat somethig");
    }
}

class Thing {
    public void eat() {
        System.out.println("Every thing in the world has to eat something to survive");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog always likes bones");
    }
}
package com.java8.practice;

import java.util.List;

public class BiConsumerEx {
    public static void main(String[] args) {

        List<Person> personList=List.of(new Person("Ram",45),
                new Person("Ajay",24),new Person("Vidhya",33),
                new Person("Manish",16));

        personList.stream().filter(person->person.getAge()>18).forEach(System.out::println);



    }
    static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

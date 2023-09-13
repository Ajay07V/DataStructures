package com.java8.practice.coreconcepts;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));
        Collections.sort(al);
        for (Student st : al) {
            System.out.println(st.rollNo + " " + st.name + " " + st.age);

        }
    }

        static class Student implements Comparable<Student> {
            final int rollNo;
            final String name;
            final int age;

            public Student(int rollNo, String name, int age) {
                this.rollNo = rollNo;
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(Student o) {
                if (age == o.age) {
                    return 0;
                } else if (age > o.age) {
                    return 1;
                } else {
                    return -1;
                }

            }
        }
    }

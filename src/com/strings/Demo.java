package com.strings;

public class Demo {
    public static void main(String[] args) {
        Sample s = new Sample(3);
        Sample s1 = new Sample(3);
        if (s.equals(s1)) {
            System.out.println("equal");
        }
        if (s1 == s) {
            System.out.println("equal");
        }

    }
}

class Sample {
    int x;

    public Sample(int i) {
        this.x = i;
    }

    public boolean equals(Sample o) {
        return this.x == o.x;
    }
}

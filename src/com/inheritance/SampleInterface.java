package com.inheritance;

@FunctionalInterface
public interface SampleInterface {
    int calculate(int a, int b);
}

/*class Sample implements SampleInterface{

    @Override
    public void methodM1() {
        System.out.println("sample method in Sample class");
    }
}*/
class Test {
    public static void main(String[] args) {
        SampleInterface si = (a, b) -> a + b;
        System.out.println(si.calculate(3, 5));


    }
}

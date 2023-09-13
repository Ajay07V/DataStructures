package com.java8.patterns;

public class SingleTonPattern {
    private static SingleTonPattern singleTonPattern;
    private static int amount;

    private SingleTonPattern() {

    }
    //eager initialization
    /*public static SingleTonPattern getInstance(){
        return  singleTonPattern;
    }*/

    //lazy initialisation
    /*public static SingleTonPattern getInstance(){
        if(singleTonPattern==null){
            singleTonPattern=new SingleTonPattern();
        }
    }*/

    public static SingleTonPattern getInstance() {
        if (singleTonPattern == null) {
            synchronized (SingleTonPattern.class) {
                if (singleTonPattern == null) {
                    singleTonPattern = new SingleTonPattern();
                }
            }
        }
        return singleTonPattern;
    }

    public int getValue(int value) {
        return amount=value+5;
    }
}

package com.strings;

public class ConcatAndAppend {
    public static void main(String[] args) {
        String s1 = "Ram";
        String s2=s1.concat("prasad");
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        StringBuffer sb=new StringBuffer("Ram");
        sb.append("prasad");
        System.out.println(sb.hashCode());
       /* String s2 = "Krishna".concat(s1);
        System.out.println(s2);*/
        /*String s3 = s1.concat(s2);
        System.out.println(s3);*/


    }
}

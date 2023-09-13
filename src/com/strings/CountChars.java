package com.strings;

import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        for(int i=0;i<s.length();i++){

           int c=s.charAt(i);
            System.out.println(c);
        }
        int capital=0;
        int small=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65&&s.charAt(i)<=90){
                capital++;
            }
            else if(s.charAt(i)>=97&&s.charAt(i)<=122){
                small++;
            }
        }
        System.out.println(capital);
        System.out.println(small);
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
          rev =rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}

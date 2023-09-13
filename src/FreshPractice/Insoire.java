package FreshPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class Insoire {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Inspyrisi");
        s.append("tech");
        System.out.println(s);

        StringTokenizer st=new StringTokenizer("I am Madhu");
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }

        ArrayList<String> arSt=new ArrayList<>();
        arSt.add("Ram");
        arSt.add("Sam");
        arSt.add("Vinay");arSt.add("Madhu");
        Iterator<String> stringIterator= arSt.iterator();
        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("Madhu",01);
        linkedHashMap.put("Srinivas",02);

        System.out.println(linkedHashMap.entrySet());



        for(int i=0;i<s.length();i++){
            String s2=""+s.charAt(i);
            System.out.println(s2);
        }
    }
}

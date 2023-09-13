package FreshPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortBasedOnThird {
    public static void main(String[] args) {
        List<String> animal= Arrays.asList("Lion","Lioness","Tiger","Elephant","Wolf");
        for(int i=0;i< animal.size();i++){
            String initial=animal.get(i);
            System.out.println(initial);
            for(int j=0;j<initial.length();j++){
                for(int k=j+1;k<initial.length();k++){
                    Character character=initial.charAt(2);
                    System.out.println(character);
                }
            }
        }
    }
}

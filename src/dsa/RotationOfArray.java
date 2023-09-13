package dsa;


import java.util.ArrayList;
import java.util.List;

public class RotationOfArray {
    public static void main(String[] args) {
        List<Integer> list= List.of(1,2,3,4);
        ArrayList<Integer> newList=new ArrayList<>();
        int k=5;
        int rotation=k% list.size();
        for(int i= list.size()-1;i>=0;i--){
            list.add(list.get(i));
        }
        for(int i=rotation;i>=0;i--){
           newList.add(list.get(i));
        }
        System.out.println(newList);

        for(int i= newList.size()-1;i>rotation;i--){
            newList.set(i, newList.get(i));
        }
        System.out.println(newList);
    }
}

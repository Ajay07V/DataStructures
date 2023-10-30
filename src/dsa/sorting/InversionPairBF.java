package dsa.sorting;

public class InversionPairBF {
    public static void main(String[] args) {
        int a[]={8,5,9,3,2,7};
        int count=0;
        for(int i=0;i< a.length-1;i++){
            for(int j=i;j< a.length-1;j++){
                if(a[j]>a[j+1]){
                    count++;
                    System.out.println(count);
                }
            }
        }
        System.out.println("Total "+count);
    }
}

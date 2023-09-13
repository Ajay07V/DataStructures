package FreshPractice;

public class ProgramOne {
    public static void main(String[] args) {
        String s1="1m2n";
        String s4="";
        for(int i=0;i<s1.length();i++){
            int asci=s1.charAt(i);
            if(asci>44&&asci<55){
                String s2=s1.charAt(i)+"";
                int k=Integer.parseInt(s2);
                for(int j=0;j<k;j++) {
                    String s3 = "" + s1.charAt(i + 1);
                    System.out.print(s3);
                }
            }
            else
            {
                s4=s1.charAt(i)+"";
                System.out.print(s4);
            }
        }
    }
}

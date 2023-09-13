package FreshPractice;

import java.io.IOException;


public class FileRead {
    public static void main(String[] args) throws IOException {
        String name = "My name is Madhu";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(i + 1)) {
                  int newCount=  count++;
                    System.out.println("Occurance "+name.charAt(i)+newCount);
                }
            }

        }

    }

}
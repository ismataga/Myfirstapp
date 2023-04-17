package udemyCourse1.tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
            String a = "SOS";
            String reversed = "";

            for (int j = a.length()-1; j>=0; j--){
               reversed+= a.charAt(j);

            }

            if(a.equals(reversed)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
    }


}

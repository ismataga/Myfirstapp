package udemyCourse1.Tapsiriqlar.tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        length();

    }

    public static void length(){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();


        int length = String.valueOf(value).length();


        System.out.println(length);
    }
}

package Aqil.Bootcamp2.tasks.task8;

import java.util.Scanner;

public class Task8T1 {
    public static void main(String[] args) {

        //1. Write a Java program to get a number from the user and print whether it is positive or negative
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin");
        int i = sc.nextInt();
        if (i > 0) {
            System.out.println("Positive");
        } else if (i < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Invalid number");
        }


    }
}

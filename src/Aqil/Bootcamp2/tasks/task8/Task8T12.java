package Aqil.Bootcamp2.tasks.task8;

import java.util.Scanner;

public class Task8T12 {
    public static void main(String[] args) {

        //11. Write a program in Java to display n terms of natural numbers and their sum.
        int i, n = 0, s = 0;
        double avg;

        System.out.println("Input the 5 numbers : ");

        for (i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            s += n;
        }
        avg = s / 5;
        System.out.println("The sum of 5 no is : " + s + "\nThe Average is : " + avg);

    }
}
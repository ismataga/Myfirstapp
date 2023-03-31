package Aqil.Bootcamp2.tasks.task8;

import java.util.Scanner;

public class Task8T6 {
    public static void main(String[] args) {


        //4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,0002. Write a Java program to solve quadratic equations (use if, else if and else).

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number a1: ");
        float a1 = sc.nextFloat();
        System.out.print("Enter number a2: ");
        float a2 = sc.nextFloat();

        a1=a1*1000;
        a2=a2*1000;
        if(a1==a2){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }

    }
}

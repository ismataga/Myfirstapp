package Aqil.Bootcamp2.tasks.task8;

import java.util.Scanner;

public class Task8T4 {
    public static void main(String[] args) {


        //4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,0002. Write a Java program to solve quadratic equations (use if, else if and else).

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number a: ");
        float a = sc.nextInt();


       if(a==0){
           System.out.println("Zero");
       } else if (a>0) {
           System.out.println("Positive");
       }else {
           System.out.println("Negative");
       }

       if(a<1){
           System.out.println("Small");
       }else if(a>100000){
           System.out.println("Larger");
       }
    }
}

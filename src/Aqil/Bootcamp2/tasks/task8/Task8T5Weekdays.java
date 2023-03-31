package Aqil.Bootcamp2.tasks.task8;

import java.util.Scanner;

public class Task8T5Weekdays {
    public static void main(String[] args) {


        //4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,0002. Write a Java program to solve quadratic equations (use if, else if and else).

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number a: ");
        int weekday = sc.nextInt();

        switch (weekday){
            case 1:
                System.out.println("m");
                break;
            case 2:
                System.out.println("th");
                break;
            case 3:
                System.out.println("w");
                break;
            case 4:
                System.out.println("tu");
                break;
            case 5:
                System.out.println("f");
                break;
            case 6:
                System.out.println("SA");
                break;
            case 7:
                System.out.println("s");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

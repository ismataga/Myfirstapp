package Aqil.Bootcamp2.tasks.task8;

import java.util.Scanner;

public class Task8T7 {
    public static void main(String[] args) {


        //4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,0002. Write a Java program to solve quadratic equations (use if, else if and else).

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int monthDay = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        


        switch (monthDay) {
            case 1:
                System.out.println(year + " January " + 31);
                break;
            case 2:
                System.out.println((year % 4 != 0 ) ? + 28 + " February " + year : 29 + " February " + year);
                break;
            case 3:
                System.out.println(year + "March: " + 31);
                break;
            case 4:
                System.out.println(year + "April: " + 30);
                break;
            case 5:
                System.out.println(year + " May: " + 31);
                break;
            case 6:
                System.out.println(year + " June: " + 30);
                break;
            case 7:
                System.out.println(year + " July: " + 31);
                break;
            case 8:
                System.out.println(" August " + 31);
                break;
            case 9:
                System.out.println(year + " September " + 31);
                break;
            case 10:
                System.out.println(year + " October " + 31);
                break;
            case 11:
                System.out.println(year + " November " + 31);
                break;
            case 12:
                System.out.println(year + " December " + 31);
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

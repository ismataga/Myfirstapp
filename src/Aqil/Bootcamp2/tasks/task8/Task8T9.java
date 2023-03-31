package Aqil.Bootcamp2.tasks.task8;

import java.util.Scanner;

public class Task8T9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an leap year: ");
        int year = sc.nextInt();


        if ((year % 4 == 0) || (year % 100 == 0) && (year%400!=0)){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }

    }
}

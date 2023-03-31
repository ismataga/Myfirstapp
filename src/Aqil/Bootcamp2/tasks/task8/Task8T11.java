package Aqil.Bootcamp2.tasks.task8;

import java.util.Scanner;

public class Task8T11 {
    public static void main(String[] args) {

        //11. Write a program in Java to display n terms of natural numbers and their sum.
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = sc.nextInt();

        if (n >= 0) {
            int a =0;
            int  i = 0 ;
            for (i = 1; i<=n;i++ ){

                System.out.println(i);
                a +=i;
            }

            System.out.println(a);
        }


    }
}

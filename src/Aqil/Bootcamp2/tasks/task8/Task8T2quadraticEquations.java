package Aqil.Bootcamp2.tasks.task8;

import java.util.Scanner;

public class Task8T2quadraticEquations {
    public static void main(String[] args) {


        //2. Write a Java program to solve quadratic equations (use if, else if and else).

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b =sc.nextInt();
        System.out.print("Enter number c: ");
        int c = sc.nextInt();

        int d = b * b - 4 * a * c;
        double x1 = 0;
        double x2 = 0;
        if(d>0){
             x1= ((-b+Math.sqrt(d))/2*a);
             x2= ((-b-Math.sqrt(d))/2*a);
            System.out.println(x1 + "," +x2);
           
        } else if (d==0) {
            x1= -b/2*a;
            x1=x2;
            System.out.println(x1 + "," + x2);
        } else {
            System.out.println("no real roots");
        }
    }
}

package udemyCourse1.Tapsiriqlar.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        int a = sc.nextInt();
        foo(a);
    }

    public static void foo(int a) {

       if(a>0) {
           System.out.println("+1");
        } else if (a<0) {
           System.out.println("-1");
       }else {
           System.out.println("0");
       }
    }
}


package udemyCourse1.tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();
        System.out.print("d: ");
        int d = sc.nextInt();


        foo(a, b, c, d);
    }

    public static void foo(int a, int b, int c, int d) {

        boolean isTrue = true;

        if (a == b || b == c || c== d || a == c || a == d || b == d || c == a) {
            System.out.println("is true");
        } else {
            System.out.println("is not true");
        }
    }
}


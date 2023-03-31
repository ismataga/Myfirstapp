package udemyCourse1.Tapsiriqlar.tasks;

import java.util.Scanner;

public class Task14 {
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

       boolean x = foo(a,b,c,d);
        System.out.println(x);
    }

    public static boolean foo(int a, int b, int c, int d) {

        if (a > b && b > c && c > d) {
            return true;
        }
        return false;
    }
}


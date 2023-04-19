package udemyCourse1.tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        double s = 0;
        for (int n = 0; n < 10; n++) {
            s = a + Math.pow(b, n);
            System.out.println(s);
        }

    }

    public static void length() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();


        int length = String.valueOf(value).length();


        System.out.println(length);
    }
}

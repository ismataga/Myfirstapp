package Aqil.Bootcamp6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int mul = 0;
        for (int i = 0; i <= 10; i++) {
            mul = n * i;
            System.out.println(n + " * " + i + " = " + mul);
        }
    }
}

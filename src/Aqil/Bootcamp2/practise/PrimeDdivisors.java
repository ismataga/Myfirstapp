package Aqil.Bootcamp2.practise;

import java.util.Scanner;

public class PrimeDdivisors {
    public static void main(String[] args) {
        int number = 0;
        try (Scanner sc = new Scanner(System.in)) {
            number = sc.nextInt();
        }
        sadeEdedleriChapEt(number);
    }

    public static void sadeEdedleriChapEt(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}

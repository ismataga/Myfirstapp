package Aqil.Bootcamp2.practise;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int num = 0;

        try(Scanner sc = new Scanner(System.in)){
            num = sc.nextInt();
        }

        int lastDigit = num % 10;

        int firstDigit = num;
        while (firstDigit >= 10){
            firstDigit = firstDigit/10;
        }
        int sum = lastDigit + firstDigit;
        System.out.println("Sum = " + sum);
    }
}

package Aqil.Bootcamp2.tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin");
        int value = sc.nextInt();

        binaryNumberConvertor(value);



    }

    public static void binaryNumberConvertor(int value) {

        int total = 0;
        while (value > 0) {

            int rest = value % 2;
            value = value / 2;

            System.out.print("" + rest);
        }

    }
}
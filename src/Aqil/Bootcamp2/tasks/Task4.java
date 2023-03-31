package Aqil.Bootcamp2.tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin");
        int value = sc.nextInt();

        int total = binaryNumberConvertor(value);
        System.out.println(total);

    }
    public static int binaryNumberConvertor(int value) {

        int total = 0;
        for (int i = 0; value > 0; i++) {

            int rest = value % 10;
            value = value / 10;

            total += rest * Math.pow(2, i);
        }
        return total;
    }

}

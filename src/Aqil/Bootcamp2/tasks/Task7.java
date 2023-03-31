package Aqil.Bootcamp2.tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin");
        int value = sc.nextInt();
        int total = 0;
        while (value > 0) {

            int rest = 0;
            rest = value % 10;
            value = value / 10;
            total = total + rest;
        }
        System.out.println(total);
    }
}

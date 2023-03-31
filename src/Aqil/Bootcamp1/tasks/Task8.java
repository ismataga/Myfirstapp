package Aqil.Bootcamp1.tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {


        double AZN = 0;
        try (Scanner sc = new Scanner(System.in)) {
            AZN = sc.nextDouble();
        }
        double usd = 1.7;

        double exchange = AZN / usd;
        System.out.println(exchange);
    }
}

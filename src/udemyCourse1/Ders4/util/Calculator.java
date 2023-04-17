package udemyCourse1.Ders4.util;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calculate();
    }

    public static double calculate() {
        Mathutil.metn("sag ol");

        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        double a = sc.nextDouble();

        System.out.println("b-ni daxil edin");
        double b = sc.nextDouble();

        System.out.println("operationi daxil edin: + 1, - 2, * 3, / 4");
        int operation = sc.nextInt();

        double result = 0;
        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("case1");
                break;
            case 2:
                result = a - b;
                System.out.println("case2");
                break;
            case 3:
                result = a * b;
                System.out.println("case3");
                break;
            case 4:
                result = a / b;

                System.out.println("case4");
                break;
            default:
                result = -1;
        }

        return result;

    }
}


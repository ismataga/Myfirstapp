package Aqil.Bootcamp2.tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        calculate();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("a-ni daxil edin");
//        double a = sc.nextDouble();
//
//
//        System.out.println("b-ni daxil edin");
//        double b = sc.nextDouble();
//
//        System.out.println("operatoru daxil edin  + 1, - 2, * 3, / 4");
//        double operation = sc.nextDouble();
//
//        double result = 0;
//        if (operation == 1) {
//            System.out.println(a + b);
//        } else if (operation == 2) {
//            System.out.println(a - b);
//        } else if (operation == 3) {
//            System.out.println(a * b);
//        } else if (operation == 4) {
//            System.out.println(a / b);
//        } else {
//            System.out.println(result);
//        }

    }

    static double calculate() {

        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        double a = sc.nextDouble();


        System.out.println("b-ni daxil edin");
        double b = sc.nextDouble();

        System.out.println("operatoru daxil edin  + 1, - 2, * 3, / 4");
        int operation = sc.nextInt();

        double result = 0;
        switch (operation) {
            case 1:
                result = a + b;
                System.out.println(result);
                break;
            case 2:
                result = a - b;
                System.out.println(result);
                break;
            case 3:
                result = a * b;
                System.out.println(result);
                break;
            case 4:
                result = a / b;
                System.out.println(result);
                break;
            default:
                result = 0;
        }
        return result;
    }
}

package Aqil.Bootcamp2.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin");
        int value = sc.nextInt();




        int i;
        for (i=2; i < value; i++) {
            if (value % i == 0) {
                System.out.println("Murrekeb ededdir");
                break;
            }

        }

        if (i == value ) {
            System.out.println("Sade ededir");
        }


    }
}



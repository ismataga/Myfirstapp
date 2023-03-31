package Aqil.Bootcamp2.forloop;

import java.util.Scanner;

public class NestedForVurmaCedveli3 {
    public static void main(String[] args) {

        int start = 0;
        int end = 0;

        try (Scanner sc = new Scanner(System.in)) {
            start = sc.nextInt();
            end = sc.nextInt();
        }

        vurmaCedveli(start,end);

    }
    public static void vurmaCedveli(int start, int end){
        for (int i = start; i <= end; i++) {

            for (int j = start; j <= end; j++)
                System.out.println(i+ " * " + j + " = " + i * j);
        }
        System.out.println();
    }
}

package Aqil.Bootcamp2.whileLoop;

import java.util.Scanner;

public class NededinCemi {
    public static void main(String[] args) {
        int number = 0;
        int result = 0;
        try(Scanner sc = new Scanner(System.in)){
            number = sc.nextInt();
        }

        int actualNumber = number;
        while (number !=0){
            result = result + number;  //reslut += number
            number = number -1; //  nuber--;
        }
        System.out.println("1-den  "  + actualNumber + "-ye qeder ededlerin cemi = " + result);
    }
}

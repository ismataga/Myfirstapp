package Aqil.Bootcamp6.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        int input = scInt.nextInt();
        Student[] students = new Student[input];
        for (int i = 0; i <input ; i++) {
            Scanner scStr = new Scanner(System.in);
            System.out.println("Enetr 1");
            String name = scStr.nextLine();
            System.out.println("Enetr 2");
            String surname = scStr.nextLine();
            System.out.println("Enetr 3");
            String profession = scStr.nextLine();
        }
    }

    public int[] fillRandomNumber(int size){
        int[] numbers = new int[size];
        Random random = new Random();

        for (int index = 0; index < size; index++) {
            numbers[index] = random.nextInt(100);

        }
        return numbers;
    }

//    public static int[] sort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-1; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temt =arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1]=temt;
//                }
//
//            }
//
//        }
//        return arr;
//    }




}

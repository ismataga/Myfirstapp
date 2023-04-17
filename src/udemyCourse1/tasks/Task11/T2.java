package udemyCourse1.tasks.Task11;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//
//        while (arr<=5){
//            char a = ' ';

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        double b = input.nextDouble();
        String c = input.nextLine();
        input.close();
        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);


    }
}


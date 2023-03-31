package Aqil.Bootcamp3.Projects.project6;

import java.util.Scanner;

public class GuessGame {
    public void startGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");

        int n = 0;
        int count = 1;
        int num =0;
        System.out.println("I'm thinking of a number between 1 and 50.");
        System.out.println("You have 5 guesses to find it.");
        while (count <= 5) {
            num = (int) (Math.random() * 50);
            System.out.print("Guess # " + count + " ");
            n = sc.nextInt();

            if (num == n) {
                System.out.println("correct");
                break;
            } else {
                System.out.println("Incorrect. Here's a clue:");
                if (num>n){
                    System.out.println("The secret number is higher than " + n);
                }else {
                System.out.println("The secret number is lower than " + n);}
                count++;
            }


        }
        System.out.println("Sorry, you didn't guess the secret number. It was " + num);
    }
}

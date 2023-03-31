package Aqil.Bootcamp3.Projects.project5;

import java.util.Scanner;

public class AnswerGame {

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("I am thinking a number between 0 to 100: ");
        int count = 1;
        int correctAnswers = 0;

        while (count <= 10) {
            int num1 = (int) (Math.random() * 100);
            int num2 = (int) (Math.random() * 100);
            int sum = num1 + num2;

            System.out.print(count + ") " + num1 + " + " + num2 + " = ");
            int guessNum = sc.nextInt();
            System.out.print("Player guessed: " + guessNum + " ");

            if (guessNum == sum) {
                System.out.println("Correct");
                correctAnswers++;
            } else {
                System.out.println(" Incorrect. The correct answer " + sum);
            }
            count++;
        }

        System.out.println("Game over. You answered " + correctAnswers + " out of 10 questions correctly.");
    }


}

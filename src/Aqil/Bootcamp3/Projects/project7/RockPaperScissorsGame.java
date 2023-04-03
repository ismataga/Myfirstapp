package Aqil.Bootcamp3.Projects.project7;

import java.util.Scanner;

public class RockPaperScissorsGame {
    private int playerScore;
    private int computerScore;

    public RockPaperScissorsGame() {

    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors!");

        int count = 1;
        System.out.println("Choose your move:\n" +
                "1. Rock\n" +
                "2. Paper\n" +
                "3. Scissors");
        while (count < 10) {
            int number = scanner.nextInt();
            if (0 < number && number < 4)
            System.out.println("Enter your move: " + number);
            else
            throw new IllegalArgumentException("This number is out of the scope");

            int guess = (int) (Math.random() * 3);
            System.out.println("Computer chooses: " + guess);
            if (number == guess) {
                System.out.println(" This round is a tie.");
            } else if (number == 1 && guess == 2 || number == 2 && guess == 3 || number == 3 && guess == 1) {
                System.out.println(" Computer wins this round.");
                computerScore++;
                System.out.println("Computer's score: " + computerScore);

            } else {
                System.out.println(" You win this round!");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            }

            count++;
        }
        System.out.println("Your score is : " + playerScore);
        System.out.println("Computer score is : " + computerScore);

        if (playerScore > computerScore) {
            System.out.println("Congratulations, you win the game!");
        } else {
            System.out.println("You lose the game");
        }
    }
}

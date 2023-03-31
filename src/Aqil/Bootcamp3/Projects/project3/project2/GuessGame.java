package Aqil.Bootcamp3.Projects.project3.project2;

public class GuessGame {
    private Player player1;
    private Player player2;
    private Player player3;

    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I am thinkingof a number beetwen 0 to 9..");

        while (true) {
            player1.guess();
            player2.guess();
            player3.guess();

            guessp1 = player1.number;
            System.out.println("Player one guessed: " + guessp1);
            guessp2 = player2.number;
            System.out.println("Player one guessed: " + guessp2);
            guessp3 = player3.number;
            System.out.println("Player one guessed: " + guessp3);

            if (guessp1 == targetNumber) p1isRight = true;
            if (guessp2 == targetNumber) p2isRight = true;
            if (guessp3 == targetNumber) p3isRight = true;

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have winner(s) !!!");

                System.out.println("Player one is: " + isPlayerRight(p1isRight));
                System.out.println("Player one is: " + isPlayerRight(p2isRight));
                System.out.println("Player one is: " + isPlayerRight(p1isRight));

                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again");
            }
        }
    }


    private String isPlayerRight(boolean isRight) {
        return isRight ? "RIGHT" : "WRONG";
    }
}

package Aqil.Bootcamp6.ticTacToe;

import java.util.Scanner;

public class TicTacToc {
    private final char[][] board;
    private char currentPlayer;



    public void play() {
        boolean gameWon = false;
        int row;
        int colum;
        Scanner scanner = new Scanner(System.in);
        while (!gameWon) {
            System.out.println();
            System.out.println("Halhazirki lovhe");
            printBoard();

            System.out.print("Oyuncu " + currentPlayer + ", sətri daxil et (1-3): ");
            row = scanner.nextInt() - 1;

            System.out.print("Oyuncu " + currentPlayer + ", stun daxil et (1-3): ");
            colum = scanner.nextInt() - 1;

            if (board[row][colum] == ' ') {
                board[row][colum] = currentPlayer;
                gameWon = checkWin(row, colum);


                if (gameWon) {
                    System.out.println("Oyuncu " + currentPlayer + "qazandi");
                } else if (isFull()) {
                    System.out.println("Oyun bittdi.");

                } else {
                    switchPlayer();
                }
            } else{
                System.out.println(" Bu yer doludur/ Yeniden cehd et");
            }

        }
    }

    private boolean checkWin(int row, int colum) {
        return (board[row][0] == currentPlayer && board[row][0] == currentPlayer && board[row][1] == currentPlayer)
                ||(board[0][colum]==currentPlayer&&board[1][colum]==currentPlayer&&board[2][colum]==currentPlayer)||
                (board[0][0]==currentPlayer&&board[1][1]==currentPlayer&&board[2][2]==currentPlayer)||
                (board[0][2]==currentPlayer&&board[1][1]==currentPlayer&&board[2][0]==currentPlayer)
                ;
    }

    private boolean isFull() {
        for (int row = 0; row < 3; row++) {
            for (int colum = 0; colum < 3; colum++) {
                if (board[row][colum] == ' ') return false;
            }
        }
        return true;
    }

    private void switchPlayer() {
        currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
    }

    TicTacToc() {
        this.board = new char[3][3];
        this.currentPlayer = 'X';
        initializeBoard();
    }


    private void initializeBoard() {

        for (int row = 0; row < 3; row++) {
            for (int colum = 0; colum < 3; colum++) {
                board[row][colum] = ' ';
            }

        }
    }

    void printBoard() {
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int colum = 0; colum < 3; colum++) {
                System.out.print(board[row][colum] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

}

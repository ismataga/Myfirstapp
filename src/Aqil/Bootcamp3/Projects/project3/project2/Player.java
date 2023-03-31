package Aqil.Bootcamp3.Projects.project3.project2;

import java.util.Scanner;

public class Player {
    public int number;

    public void guess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("I am guessing... ");
        this.number = sc.nextInt();
    }
}

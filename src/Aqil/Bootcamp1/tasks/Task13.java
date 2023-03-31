package Aqil.Bootcamp1.tasks;

public class Task13 {
    public static void main(String[] args) {
        int n = 25;
        if (n % 2 != 0) {
            System.out.println("Weired");
        } else if (n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("NotWeried");
        } else if (n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println("Weired");
        } else if (n % 2 == 0 && n >= 20) {
            System.out.println("NotWeried");
        }
    }
}

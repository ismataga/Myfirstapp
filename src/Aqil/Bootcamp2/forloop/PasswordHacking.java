package Aqil.Bootcamp2.forloop;

import java.util.Scanner;

public class PasswordHacking {
    public static void main(String[] args) {
        int password;
        try (Scanner sc = new Scanner(System.in)) {

            password = sc.nextInt();

            System.out.println(password);
        }
    }

    static int findPassword(int password) {
        for (int i = 0; i < 10000; i++) {
            if (password == i) return i;
        }
        return -1;
    }
}


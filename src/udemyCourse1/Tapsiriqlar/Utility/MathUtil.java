package udemyCourse1.Tapsiriqlar.Utility;

import java.util.Scanner;

public class MathUtil {
    public static void find(int value, int divideBy) {
        for (int i = 0; i <= value; i++) {
            if (divideBy == 0) {
                System.out.println(i);
            }
        }

    }

    public static void findBy2(int value) {
        find(value, 2);
    }

    public static int findTotal(int value) {
        int total = 0;
        while (value > 0) {
            int rest = value % 10;
            value = value / 10;
            total += rest;
        }
        return total;
    }

    public static int findFaktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * findFaktorial(n - 1));
        }

    }

    public static int findReverse(int value) {
        int reverse = 0;
        while (value > 0) {
            reverse *= 10;
            reverse += value % 10;
            value = value / 10;
        }
        return reverse;
    }

    public static boolean findPalyndrom(int value) {
        return value == findReverse(value);
    }

    public static void findPrimeNumbers(int value) {

        FIRST:
        for (int j = 2; j <= value; j++) {

            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    continue FIRST;
                }
            }
            System.out.println(j);
        }
    }

    public static void convertDigitToLetter() {

        String[] teklikler = {"sifir", "bir", "iki", "uc", "dord", "bes", "alti", "yeddi", "sekkiz", "doqquz"};
        String[] onluqlar = {"", "on", "iyirmi", "otuz", "qirx", "elli", "altmis", "yetmis", "seksen", "doxsan"};

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        String result = "";


        while (value != 0) {
            int length = String.valueOf(value).length();

            if (length == 4) {
                int minlik = value / 1000;
                String minlikS = teklikler[minlik];
                result = minlikS + " min ";
                value = value - minlik * 1000;
            }

            if (length == 3) {
                int yuzluk = value / 100;
                String yuzlukS = teklikler[yuzluk];
                result = result + yuzlukS + " yuz ";
                value = value - yuzluk * 100;
            }

            if (length == 2) {
                int onluq = value / 10;
                String onluqS = onluqlar[onluq];
                result = result + onluqS;
                value = value - onluq * 10;
            }

            if (length == 1) {
                int teklik = value;
                String teklikS = teklikler[teklik];
                result = result + " " + teklikS;
                value = value - teklik;
            }

        }

        System.out.println(result);
    }
}



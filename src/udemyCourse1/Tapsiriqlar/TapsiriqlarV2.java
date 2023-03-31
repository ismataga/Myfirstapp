package udemyCourse1.Tapsiriqlar;

import java.util.Scanner;

public class TapsiriqlarV2 {
    public static void main(String[] args) {


        //                      0          1     2     3    4         5     6       7          8       9
        String[] teklikler = {"sifir", "bir", "iki", "uc", "dord", "bes", "alti", "yeddi", "sekkiz", "doqquz"};
        String[] onluqlar = {"", "on", "iyirmi", "otuz", "qirx", "elli", "altmis", "yetmis", "seksen", "doxsan"};

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        String result = "";

        while (value != 0) {

            int length = String.valueOf(value).length();
            int pow = (int) Math.pow(10, length - 1);
            int mertebelik = value / pow;

            if (length == 4) {
                result = teklikler[mertebelik] + " min ";
            } else if (length == 3) {
                result += teklikler[mertebelik] + " yuz ";
            } else if (length == 2) {
                result += onluqlar[mertebelik];
            } else if (length == 1) {
                result += " " + teklikler[mertebelik];
            }

            value -= pow * mertebelik;
        }

        System.out.println(result);
    }
}






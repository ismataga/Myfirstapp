package udemyCourse1.Tapsiriqlar.tasks;

import udemyCourse1.Tapsiriqlar.Ders5obyektler.Utility.MathUtil;

public class tapsiriqlar {
    public static void main(String[] args) {


//        String[] teklikler = {"sifir", "bir", "iki", "uc", "dord", "bes", "alti", "yeddi", "sekkiz", "doqquz"};
//        String[] onluqlar = {"", "on", "iyirmi", "otuz", "qirx", "elli", "altmis", "yetmis", "seksen", "doxsan"};
//
//        Scanner sc = new Scanner(System.in);
//        int value = sc.nextInt();
//        String result = "";
//
//
//        while (value != 0) {
//            int length = String.valueOf(value).length();
//
//            if (length == 4) {
//                int minlik = value / 1000;
//                String minlikS = teklikler[minlik];
//                result = minlikS + " min ";
//                value = value - minlik * 1000;
//            }
//
//            if (length == 3) {
//                int yuzluk = value / 100;
//                String yuzlukS = teklikler[yuzluk];
//                result = result + yuzlukS + " yuz ";
//                value = value - yuzluk * 100;
//            }
//
//            if (length == 2) {
//                int onluq = value / 10;
//                String onluqS = onluqlar[onluq];
//                result = result + onluqS;
//                value = value - onluq * 10;
//            }
//
//            if (length == 1) {
//                int teklik = value;
//                String teklikS = teklikler[teklik];
//                result = result + " " + teklikS;
//                value = value - teklik;
//            }
//
//        }
//
//        System.out.println(result);

        MathUtil.convertDigitToLetter();


    }
    public static void displayHighScorePosition(){
        String x = "jonn";
        String y = "tim";

        int a = 1;
        int b = 2;
        System.out.println(y + " managed to get into position " + b + " on the high score list");

    }
}








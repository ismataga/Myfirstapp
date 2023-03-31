package Aqil.Bootcamp1.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        int tax = 0;
        try (Scanner sc = new Scanner(System.in)) {
            tax = sc.nextInt();
        }
        taxes(tax);

//        if (tax <= 200000) {
//            int sadelesmishVergi = tax;
//            if (sadelesmishVergi <= 32000) {
//                System.out.println("sadelesmisVergi 10%: " + sadelesmishVergi * 10 / 100);
//            } else {
//                System.out.println("sadelesmisVergi 10%: " + sadelesmishVergi * 25 / 100);
//            }
//
//
//        } else if (tax > 200000) {
//            int menfeetVergisi = tax;
//            if (menfeetVergisi <= 320000) {
//                System.out.println("menfeetvergisi 10%: " + menfeetVergisi * 10 / 100);
//            } else {
//                System.out.println("menfeetvergisi 25%: " + menfeetVergisi * 25 / 100);
//            }
//        } else {
//            System.out.println("vergi yigilmayib");
//        }


    }

    public static int taxes(int tax){
        if (tax <= 200000) {
            int sadelesmishVergi = tax;
            if (sadelesmishVergi <= 32000) {
                System.out.println("sadelesmisVergi 2%: " + sadelesmishVergi * 2 / 100);
            } else {
                System.out.println("sadelesmisVergi 4%: " + sadelesmishVergi * 4 / 100);
            }


        } else if (tax > 200000) {
            int menfeetVergisi = tax;
            if (menfeetVergisi <= 320000) {
                System.out.println("menfeetvergisi 14%: " + menfeetVergisi * 14 / 100);
            } else {
                System.out.println("menfeetvergisi 20%: " + menfeetVergisi * 20 / 100);
            }
        } else {
            System.out.println("vergi yigilmayib");
        }
        return tax;
    }

//    3
}

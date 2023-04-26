package hackerRank;

import java.util.Scanner;

public class HackerRankIntToSString {
    public static void main(String[] args) {
//        int i = 1000;
//        if (i <= 100 && i >= -100) {
//            String s = String.valueOf(i);
//            System.out.println(s);
//        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        if (n <= 100 && n >= -100){
            String s =  String.valueOf(n);
            if (s.equals(Integer.toString(n))) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        }


    }
}


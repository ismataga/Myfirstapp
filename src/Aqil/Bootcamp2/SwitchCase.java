package Aqil.Bootcamp2;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int num = 1;

        try( Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }

        switch (num){
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            default:
                System.out.println("zehmet olmasa 1 ve 3 daxil edin");
        }
//        if(num==1){
//            System.out.println("bir");
//        } else if (num==2) {
//
//            System.out.println("iki");
//        } else if (num==3) {
//            System.out.println("uc");
//        }else{
//            System.out.println("zehmet olmasa 1 ve 3 daxil edin");
//        }
    }
}

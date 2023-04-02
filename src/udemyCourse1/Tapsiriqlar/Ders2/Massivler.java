package udemyCourse1.Tapsiriqlar.Ders2;

import java.util.Scanner;

public class Massivler {

    public static void main(String[] args) {
     boolean b= detectSymmetry("Hello");
        System.out.println("b=" + b);
    }

    public static boolean detectSymmetry(String s1){
        for(int i = 0; i < s1.length(); i++){
            char sol = s1.charAt(i);
            char sag = s1.charAt(s1.length() - 1 - i);
            System.out.println("_________");
            System.out.println("sol=" + sol);
            System.out.println("sag=" + sag);
            if (sol != sag){
                return false;
            }
        }
        System.out.println("finished");
        return true;
    }

    public static void coxsiraliMassiv() {
        int[][] arr = new int[2][5];
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);


        System.out.println("daxil edilme");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("i="+i +",j="+j+".ededi daxil edin:");
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println("chap edilme:");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++) {
                System.out.println("i="+i + ".j=" + j + "." + arr[i][j]);
            }
        }

    }

    public static void birsiraliMassiv(){
        int[] arr = new int[5];


        System.out.println("daxil edilme");
        for(int i=0;i< arr.length;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println(i+".ededi daxil edin:");
            arr[i] = sc.nextInt();

        }

        System.out.println("chap edilme:");
        for(int i=0;i< arr.length;i++){
            System.out.println(i+"."+arr[i]);
        }

    }
}

package Aqil.Bootcamp2;

import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("adiniz nedir");
            String name = sc.nextLine();
            System.out.println("ad " + name + "dir.");
            int age = sc.nextInt();
            System.out.println("Yas: " + age);}
        catch (Exception e){
            System.out.println("zehmet olmasa tam eded daxil edin");
        }

//        System.out.println("yasininz necedir");
//        int a = sc.nextInt();
//        System.out.println("yas " + a);

    }
}

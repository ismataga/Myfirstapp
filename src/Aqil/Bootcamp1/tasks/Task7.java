package Aqil.Bootcamp1.tasks;

public class Task7 {
    public static void main(String[] args) {
        byte bD = 10;
        byte bM = 10;
        int bY = 1995;
        byte cD = 10;
        byte cM = 03;
        int cY = 2023;
        System.out.print("Birhday: " + bD + ".");
        System.out.print(bM + ".");
        System.out.println(bY);
        System.out.print("Currentday: " + cD + ".");
        System.out.print("0"+cM + ".");
        System.out.println(cY);

        int year = 365;
        int age = 27;
        int a = age / 4;
        int wholeDay = year * age - a;
        System.out.println(wholeDay);
    }
}

package Aqil.Bootcamp3.consturctor;

public class Test {
    public static void main(String[] args) {
        Person ali = new Person("Ali", 18, "male");
        Person vali = new Person("vali", 19, "male");
        Person aysu = new Person("aysu", 23, "fmale");

        System.out.println(ali.toString());
        System.out.println(vali.toString());
        System.out.println(aysu.toString());
    }
}

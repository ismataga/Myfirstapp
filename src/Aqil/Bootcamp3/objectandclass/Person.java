package Aqil.Bootcamp3.objectandclass;

public class Person {
    public static String test = "This is test";

    public static void testMethod(){
        System.out.println("This is a test method");
    }

    public static void main(String[] args) {
        Person ali = new Person();
        ali.name = "Ali";
        System.out.println(ali.name);
    }

    public int age;
    public String name;
    public String gender;

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public void walk() {
        System.out.println("Walking");
    }


    public void printPersonInfo() {
        System.out.println(
                "name: " + name
                        + " age: " + age
                        + " gender: " + gender
        );

    }
}

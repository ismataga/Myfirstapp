package Aqil.Bootcamp3.encapsulation;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Ali");
        person.setAge(18);
        person.setGender("male");

        String name = person.getName();
        int age = person.getAge();
        String gender = person.getGender();

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("gende: " + gender);
    }
}

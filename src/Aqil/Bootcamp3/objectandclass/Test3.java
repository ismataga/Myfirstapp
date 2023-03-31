package Aqil.Bootcamp3.objectandclass;

import Aqil.Bootcamp3.objectandclass.Person;

public class Test3 {
    public static void main(String[] args) {
       Person person= new Person();
        System.out.println(person.name);
       person.name = "Ali";
        System.out.println(person.name);
    }
}

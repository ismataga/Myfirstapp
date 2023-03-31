package Aqil.Bootcamp3.objectandclass;

import Aqil.Bootcamp3.objectandclass.Person;

public class Test {
    public static void main(String[] args) {

        new Person();
        Person person1 = new Person();

        Person person2 = new Person();

        Person person3 = person2;
        System.out.println(person1);
    }
}


package Aqil.Bootcamp3.objectandclass;

import Aqil.Bootcamp3.objectandclass.Person;

public class Test4 {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Ali";
        person.age = 17;
        person.gender = "male";
        person.printPersonInfo();

        Person vali = new Person();

        vali.name = "Vali";
        vali.age = 23;
        vali.gender = "male";
        vali.printPersonInfo();

        Person aysu = new Person();
        aysu.name = "Aysu";
        aysu.age = 19;
        aysu.gender = "fmale";
        aysu.printPersonInfo();
    }
}

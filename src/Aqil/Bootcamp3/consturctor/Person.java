package Aqil.Bootcamp3.consturctor;

public class Person {
    public int age;
    public String name;
    public String gender;

    public Person(){
        System.out.println("Person defoult constructor caller");
    }


    public Person(String name){
        this.name = name;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = 18;
    }
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

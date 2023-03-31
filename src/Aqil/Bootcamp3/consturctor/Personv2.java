package Aqil.Bootcamp3.consturctor;

public class Personv2 {
    public int age;
    public String name;
    public String gender;

    public Personv2() {
        System.out.println("Person defoult constructor caller");
    }


    public Personv2(String name) {
        this.name = name;
    }

    public Personv2(String name, int age) {
        this(name);
        this.age = 18;
    }

    public Personv2(String name, int age, String gender) {
        this(name, age);
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

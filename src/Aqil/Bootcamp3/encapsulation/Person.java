package Aqil.Bootcamp3.encapsulation;

public class Person {
    private int age;
    private String name;
    private String gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalStateException("Age must be positive");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;


    }

    public void setGender(String gender) {
        if (gender == null) {
            throw new IllegalArgumentException("Gendr must not be null");
        }

        String currentGender = gender.toLowerCase();

        switch (currentGender) {
            case "male":
                this.gender = "male";
                break;
            case "fmale":
                this.gender = "fmale";
                break;
            default:
                throw new IllegalArgumentException(" Gender  must be either male or fmale");
        }
        this.gender = currentGender;
    }

}


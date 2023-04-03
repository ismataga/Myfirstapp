package Aqil.Bootcamp4.polimorphisim;

public class Animal {
    private String name;
    private String location;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {


        return name;
    }

    public void setName() {

    }


    public void makeSound() {
        System.out.println("the animalmake sound");
    }

    @Override
    public String toString() {
        return name;
    }
}

package Aqil.Bootcamp4.polimorphisim;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }



}

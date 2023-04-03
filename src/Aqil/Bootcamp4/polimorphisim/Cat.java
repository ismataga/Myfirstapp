package Aqil.Bootcamp4.polimorphisim;


import java.util.Arrays;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
    public void test(){
    }



}

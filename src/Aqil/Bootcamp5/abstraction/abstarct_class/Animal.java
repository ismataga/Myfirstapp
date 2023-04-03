package Aqil.Bootcamp5.abstraction.abstarct_class;

public abstract class Animal {
    protected String type;
    private String size;
    double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    public abstract void move(String speed);
    public abstract void makeSound();

    public void printType(){
        System.out.println("tyepe of " + type);
    }
}

package Aqil.Bootcamp5.abstraction.abstarct_class;

public class Dog extends Animal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }



    @Override
    public void move(String speed) {
        if("slow".equals(speed)){
            System.out.println(type + " walking");
        }else {
            System.out.println(type + "runnig");
        }

    }

    @Override
    public void makeSound() {
        if (type.equals("Wolf")){
            System.out.println("Hawling");
        }else {
            System.out.println("Barking");
        }

    }
}

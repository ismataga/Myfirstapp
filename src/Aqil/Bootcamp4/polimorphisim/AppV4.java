package Aqil.Bootcamp4.polimorphisim;


import java.util.Arrays;

public class AppV4 {
    public static void main(String[] args) {
        int[] array = new int[6];
        array[1] = 5;
        System.out.println(Arrays.toString(array));

        Animal[] animals = new Animal[6];
        Cat cat1 = new Cat("Cat 1");
        Cat cat2 = new Cat("Cat 2");
        Cat cat3 = new Cat("Cat 3");


        Dog dog1 = new Dog("d1");
        Dog dog2 = new Dog("d2");
        Dog dog3 = new Dog("d3");


        animals[0] = cat1;
        animals[1] = cat2;
        animals[2] = cat3;
        animals[3] = dog1;
        animals[4] = dog2;
        animals[5] = dog3;


        printNames(animals);
    }

    public static void printNames(Animal[] animals) {
        System.out.println(Arrays.toString(animals));
    }

}

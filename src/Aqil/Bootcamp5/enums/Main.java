package Aqil.Bootcamp5.enums;

public class Main {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;

        switch (level){
            case LOW -> System.out.println("LOW level");
            case MEDIUM -> System.out.println("MEDIUM level");
            case HIGH -> System.out.println("HIGH level");
        };

        Level[] values = Level.values();
        for (Level value: values){
            System.out.println(value);
        }
    }
}

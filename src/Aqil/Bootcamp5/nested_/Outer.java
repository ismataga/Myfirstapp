package Aqil.Bootcamp5.nested_;

public class Outer {
    private int x = 10;

    static class Nested{
        public void printX(){
            Outer outer = new Outer();
            System.out.println(outer.x);

        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.printX();

    }
}

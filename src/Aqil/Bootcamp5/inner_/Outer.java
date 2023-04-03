package Aqil.Bootcamp5.inner_;

public class Outer {
    private int x = 10;

    class Inner {
        public void printX() {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.printX();


    }
}
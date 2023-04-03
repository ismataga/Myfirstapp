package Aqil.Bootcamp5.final_class;

public class Test {
    public static void main(String[] args) {
        int add = MathUtils.add(3, 5);
        System.out.println(add);

        int multiply = MathUtils.multiply(3, 5);
        System.out.println(multiply);

        MathUtils mathUtils = new MathUtils();
        mathUtils.test(1);

    }
}

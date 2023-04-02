package udemyCourse1.Tapsiriqlar.Ders1;

public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            double random = Math.random();

            int result1 = 10 + (int) (random * 91) + 1;
            int result2 = 10 + (int) (random * 990);

            System.out.println(result1 + "  " + result2);
        }
    }
}


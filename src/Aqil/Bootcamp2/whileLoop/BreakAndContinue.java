package Aqil.Bootcamp2.whileLoop;

public class BreakAndContinue {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            if (i >= 50 && i <= 60) {
//                continue;
//            }
//
//            System.out.println(i);
//        }

        for (int i = 0; i < 100; i++) {
            if (i == 60) {
                break;
            }

            System.out.println(i);
        }
    }
}

package udemyCourse1.Tapsiriqlar.tasks;

public class Task20 {
    public static void main(String[] args) {
        foo("sozlerkosku", 3, 7);

    }

    public static void foo(String a, int b, int c) {

        for (int i = b; i <= c; i++) {
            System.out.println(a.charAt(i));
        }
    }
}



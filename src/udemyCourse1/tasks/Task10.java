package udemyCourse1.tasks;

public class Task10 {
    public static void main(String[] args) {

        foo(1, 6, 2);
    }

    public static void foo(int a, int b, int c) {

        for (int i = a; i < b; i++) {
            System.out.println(Math.pow(i, c));
        }
    }
}

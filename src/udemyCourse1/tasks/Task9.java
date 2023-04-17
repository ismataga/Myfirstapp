package udemyCourse1.tasks;

public class Task9 {
    public static void main(String[] args) {

        foo(4, 'x', false);
    }

    public static void foo(int a, char c, boolean altAlta) {

        if (altAlta == true) {
            for (int i = 0; i <= a; i++) {
                System.out.println(c);
            }
        } else {
            for (int i = 0; i <= a; i++) {
                System.out.print(c);
            }
        }
    }
}

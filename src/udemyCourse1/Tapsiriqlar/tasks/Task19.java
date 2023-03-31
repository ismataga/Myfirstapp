package udemyCourse1.Tapsiriqlar.tasks;

public class Task19 {
    public static void main(String[] args) {
       String istrue =  foo("sozlerkosku", "soz");
        System.out.println(istrue);

    }

    public static String foo(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        } else {
            return b;
        }

    }
}



package udemyCourse1.Ders5obyektler;

public class Main {
    public static void main(String[] args) {
        User.umumi = "Salam";

        User u = new User();
        u.name = "sarkhan";

        User u2 = new User();
        u2.name = "aqil";

        Test.deyish();

        System.out.println(u.name);
        System.out.println(u2.name);
        System.out.println(User.umumi);
    }
}

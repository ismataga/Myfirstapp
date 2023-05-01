package udemyCourse1.ders7collection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Eladar");
        l.add("Rasid");
        l.add("Cavid");
        l.add("Rauf");
        l.add("Tural");

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}

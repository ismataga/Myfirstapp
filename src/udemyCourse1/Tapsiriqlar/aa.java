package udemyCourse1.Tapsiriqlar;

public class aa {
    public static void main(String[] args) {
        int x = 764;

        System.out.println(x / 100);// yuzluk mertebesindeki eded
        System.out.println(x / 100 * 100);// yuzluyu cap edir
        System.out.println((x - (x / 100 * 100)) / 10);// onlug mertebesindeki reqemi  cap edir
        System.out.println(((x - (x / 100 * 100)) / 10) * 10);// onlugu cap et
        System.out.println(x % 10);
        System.out.println(String.valueOf(x).length());// valueOf is to convert integer to string

        String a = "a";
        a = a + "b";

        System.out.println(a);

    }
}

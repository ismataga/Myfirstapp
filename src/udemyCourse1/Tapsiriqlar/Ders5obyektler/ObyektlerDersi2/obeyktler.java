package udemyCourse1.Tapsiriqlar.Ders5obyektler.ObyektlerDersi2;

public class obeyktler {

    public static void main(String[] args) {
      User u =new User("Anar","Babayev",25);
        System.out.println(u.getName());
    }
    public static void foo(){
        foo2();//pause
        System.out.println("foo");
    }
    public static void foo2(){
        foo3();//pause
        System.out.println("foo2");
    }

    public static void foo3(){
        System.out.println("foo3");
    }
}

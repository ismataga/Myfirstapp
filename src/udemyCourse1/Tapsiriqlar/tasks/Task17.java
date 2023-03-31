package udemyCourse1.Tapsiriqlar.tasks;

public class Task17 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("a: ");
//        int a = sc.nextInt();
//        System.out.print("b: ");
//        int b = sc.nextInt();
//        System.out.print("c: ");
//        int c = sc.nextInt();
//        System.out.print("d: ");
//        int d = sc.nextInt();

        String aaa = foo("soz", 'c', 5);
        System.out.println(aaa);
    }

    public static String foo(String b, char a, int i) {
        String z = b;
        for (int x = 0; x <= i; x++) {
            z = z + a;
        }
        return z;
    }
}



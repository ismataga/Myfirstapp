package udemyCourse1.Tapsiriqlar.tasks;

public class Task18 {
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

        boolean aaa = foo("soz", "doz", "koz");
        System.out.println(aaa);
    }

    public static boolean foo(String a, String b, String c) {
        if (a.contains(c) && b.contains(c)) {
            return true;
        } else {
            return false;
        }
    }
}



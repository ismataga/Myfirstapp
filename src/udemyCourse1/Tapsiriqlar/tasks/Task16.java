package udemyCourse1.Tapsiriqlar.tasks;

public class Task16 {
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

        char aaa = foo("azer",0 );
        System.out.println(aaa);
    }

    public static char foo(String b, int i) {

        if (i >= 0 && i < b.length()) {
            return b.charAt(i);
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds!");
        }
    }
}


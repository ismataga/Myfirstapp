package udemyCourse1.tasks;

public class Task15 {
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

        char aaa = foo("azer", 5);
        System.out.println(aaa);
    }

    public static char foo(String b, int i) {
       return b.charAt(i -1);

    }
}


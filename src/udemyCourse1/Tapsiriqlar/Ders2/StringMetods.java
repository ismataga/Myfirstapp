package udemyCourse1.Tapsiriqlar.Ders2;

import java.util.Scanner;

public class StringMetods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("metini daxil edin");
        String s = sc.nextLine();

        int i = s.length();
        System.out.println("lenght="+i);

        char c2 = s.charAt(s.length()-1);
        System.out.println("last symbol=" + c2);

        String substring = s.substring(1,3);
        System.out.println("substring=" + substring);

    boolean b = s.contains("Lan"); //Java Language
        System.out.println("contain=" + b);

        boolean b2 = s.equals("Java Language");
        System.out.println("equals=" + b2);

        boolean b22 = s.equalsIgnoreCase("java LanguaGe");
        System.out.println("equals Ignor Case=" + b22);

        boolean b3 = s.isEmpty();//
        System.out.println("is empty=" + b3);

        boolean b4 = s.startsWith("Java");
        System.out.println("start with=" + b4);

        boolean b5 = s.endsWith("age");
        System.out.println("end with=" + b5);

        String ss = s.trim();//Java   Language
        System.out.println("trim=" + ss);

        String lower = s.toLowerCase();//Java Language --> java language
        System.out.println("s.toLowerCase() -->  " + lower);

        String upper = s.toUpperCase();
        System.out.println("to upper case=" + upper);

        int index = s.indexOf("LAN");
        System.out.println("index of LAN=" + index);

        int lastIndex = s.lastIndexOf("A");
        System.out.println("last index of A=" + lastIndex);

        String replace = s.replace("Java", "Hello World");
        System.out.println("replace to Java with Hello World=" + replace);


    }
}

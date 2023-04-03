package Aqil.Bootcamp5.Wraped;

public class Test {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(a);

        Integer b = 10;
        System.out.println(b);

        String string = b.toString();
        System.out.println(string);

        int num1 = 1;
        int num2 = 1;
        System.out.println(num1==num2);

        Integer a1 = 1;
        Integer a2 = 1;
        System.out.println(a1==a2);

        Integer a3 = 1000;
        Integer a4 = 1000;
        System.out.println(a3==a4);

        Boolean a5 =true;
        System.out.println(Boolean.TRUE);

        System.out.println(Boolean.parseBoolean("TRUE"));
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.parseBoolean("TruE"));
        System.out.println(Boolean.parseBoolean("tRuE"));
        System.out.println(Boolean.parseBoolean("test"));
        System.out.println(Boolean.parseBoolean(null));


    }
}

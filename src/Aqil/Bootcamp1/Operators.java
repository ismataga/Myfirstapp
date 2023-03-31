package Aqil.Bootcamp1;

public class Operators {
    public static void main(String[] args) {
        //ucbucagin terefleri a b c

        int a = 10;
        int b = 20;
        int c = 30;

        int p = a + b + c;


        //kvadratin sahesii

        int x = 5;
        int s = (int) Math.pow(x, 2);
        System.out.println("kvadratin terefi:" + s);

        int firstNum = 101;
        int secondNum = 10;

        int intResult = firstNum / secondNum;
        System.out.println("intResult =" + intResult);

        int intQaliq = firstNum%secondNum;
        System.out.println("intQaliq = " + intQaliq);

        double doubleNum = 1.123;
        float floatNum = 1.123f;

        System.out.println("doublenum =" + doubleNum);
        System.out.println("floatnum =" + floatNum);

        double resultDouble = (double)firstNum/(double) secondNum;
        System.out.println(resultDouble);

        int firstN = 10;
        firstN = firstN -3;
        System.out.println(firstN);

        firstN += 3;
        System.out.println(firstN);

        System.out.println(12==12);
        System.out.println(11==12);

        System.out.println(1!=2);
    }
}

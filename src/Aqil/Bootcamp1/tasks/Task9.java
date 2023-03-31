package Aqil.Bootcamp1.tasks;

public class Task9 {
    public static void main(String[] args) {

        //double result = Math.pow((4 + 2 * Math.sqrt(3)) / (5 - Math.sqrt(7)), 3) * Math.sqrt(2);

        // 1st formula

        double vt = 0;
        double gt = 1;
        double s1 = 0;
        double s = s1 + vt + (Math.pow(gt, 2)) / 2;
        System.out.println(s);


        // 2nd formula

        double a = 0;
        double P = 0;
        double m1 = 0;
        double m2 = 0;
        double G = ((4 * Math.pow(Math.PI, 2)) * Math.pow(a, 3)) / ((Math.pow(P, 2)) * (m1 + m2));
        System.out.println(G);

        //3rd formula

        double PV = 0;
        double INT = 0;
        double YRS = 1;

        double FV = PV * Math.pow((1 + INT / 100), YRS);
        System.out.println(FV);

        //4th formula

        double x = 0;
        double y = 0;
        double c = Math.sqrt((Math.pow(x, 2)) + Math.pow(y, 2) - 2*x*y*Math.cos(y));
        System.out.println(c);

        //5th formula  Write an TaxCalculator



    }
}

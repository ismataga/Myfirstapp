package Aqil.Bootcamp4.Inheritance.challange;

public class HourlyEmployee extends Employee {
    public double hourlyPayRate;
    public void getDoublePay(){
        double doublePay = hourlyPayRate * 2;
        System.out.println("Double pay "  + doublePay);

    }


}

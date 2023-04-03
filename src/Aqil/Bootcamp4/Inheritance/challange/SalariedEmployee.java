package Aqil.Bootcamp4.Inheritance.challange;

public class SalariedEmployee extends Employee{
    public double annualySalary;
    public boolean isRetired;


    public void retire(){
        if(!isRetired){
            System.out.println("Employee is already retired");

        }
        isRetired = true;

    }

    @Override
    public double collectPay() {
        int hireDateYear= hireDate.getYear();
        int endDateYear = endDate.getYear();
        int worked = endDateYear - hireDateYear;
        int workedYear = endDateYear - hireDateYear;

        return workedYear * annualySalary;
    }
}

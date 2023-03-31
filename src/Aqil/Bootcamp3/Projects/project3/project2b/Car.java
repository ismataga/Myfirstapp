package Aqil.Bootcamp3.Projects.project3.project2b;

public class Car {

    private String maker;
    private String model;
    private int year; 
    private double rentalPricePerDay;

    public Car(String maker, String model, int year, double rentalPricePerDay) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", rentalPricePerDay=" + rentalPricePerDay +
                '}';
    }
}

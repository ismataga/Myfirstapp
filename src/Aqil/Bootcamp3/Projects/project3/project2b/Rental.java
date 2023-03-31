package Aqil.Bootcamp3.Projects.project3.project2b;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rental {
    private Car car;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;

    public Rental( Car car,Customer customer, LocalDate StartDate, LocalDate EndDate) {
        this.car = car;
        this.customer =customer;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getRentalDays() {
        return (int) ChronoUnit.DAYS.between(startDate, endDate);
    }

    public double getRentalPrice() {
        return getRentalDays() * car.getRentalPricePerDay();
    }

    @Override
    public String toString() {
        return "Rental{" +
                "car=" + car +
                ", customer=" + customer +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

package Aqil.Bootcamp3.Projects.project3.project2b;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020, 50);
        Car car2 = new Car("Honda", "Civic", 2019, 45);

        Customer customer1 = new Customer("John Smith", "D123456");
        Customer customer2 = new Customer("Jane Doe", "D234567");

        LocalDate startDate1 = LocalDate.of(2023, 3, 10);
        LocalDate endDate1 = LocalDate.of(2023, 3, 15);

        Rental rental1 = new Rental(car1, customer1, startDate1, endDate1);

        LocalDate startDate2 = LocalDate.of(2023, 3, 12);
        LocalDate endDate2 = LocalDate.of(2023, 3, 17);

        Rental rental2 = new Rental(car2, customer2, startDate2, endDate2);

        System.out.println(rental1);
        System.out.println(rental2);
    }
}
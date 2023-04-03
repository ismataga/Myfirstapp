package Aqil.Bootcamp4.Inheritance.challange;

import java.time.LocalDate;

public class Worker {
    protected String name;
    protected LocalDate birthDate;
    protected LocalDate endDate;

    public int getAge() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(LocalDate endDate) {
        this.endDate = endDate;
    }
}

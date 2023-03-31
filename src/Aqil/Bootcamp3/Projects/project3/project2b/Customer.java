package Aqil.Bootcamp3.Projects.project3.project2b;

public class Customer {
   private String name;
   private String driverLicese;

   public Customer(String name, String driverLsience){
      this.name = name;
      this.driverLicese = driverLsience;
   }

   public String getName(){

      return name;
   }

   public String getDriverLicese(){

      return driverLicese;
   }

   @Override
   public String toString() {
      return "Customer{" +
              "name='" + name + '\'' +
              ", driverLicese='" + driverLicese + '\'' +
              '}';
   }
}



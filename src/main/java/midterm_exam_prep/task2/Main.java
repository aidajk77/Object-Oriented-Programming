package midterm_exam_prep.task2;

import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("123","audi",50.00,CarType.SPORTS,"Diesel");
        Motorcycle bike = new Motorcycle("321","yamaha", 25,250);
        RentalCompany company = new RentalCompany("company");
        company.addVehicle(bike);
        company.addVehicle(car);
        RentalTransaction<Car> tr1 = new RentalTransaction<>("1",LocalDate.of(2024,11,17),23);
        RentalTransaction<Motorcycle> tr2 = new RentalTransaction<>("2",LocalDate.of(2024,11,17),23);
        tr1.addVehicleToRental(car,3);
        tr2.addVehicleToRental(bike,3);
        Customer customer = new Customer("23","customer","061492822");
        customer.addRentalTransaction(tr1);
        customer.addRentalTransaction(tr2);
        company.addCustomer(customer);
        double total = company.calculateTotalRevenue(0.1);

        System.out.println("Total revenue: " + total);
    }
}

package midterm_exam_prep.task2;

import java.util.HashMap;
import java.time.*;

public class RentalTransaction <T extends Vehicle & Rentable>{
    private String transactionId;
    private LocalDate rentalDate;
    private HashMap<T,Integer> rentedVehicles;
    private int customerId;

    public RentalTransaction(String transactionId, LocalDate rentalDate, int customerId) {
        this.transactionId = transactionId;
        this.rentalDate = rentalDate;
        this.customerId = customerId;
        rentedVehicles = new HashMap<>();
    }

    public void addVehicleToRental(T vehicle, int days){
        rentedVehicles.put(vehicle, days);
    }

    public double calculateTotalAmount(double discount){
        double totalAmount = 0;
        for(T vehicle : rentedVehicles.keySet()){
            totalAmount = totalAmount + (rentedVehicles.get(vehicle)* (vehicle.getRentalRate()-vehicle.applyDiscount(discount)));
        }
        return totalAmount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public HashMap<T, Integer> getRentedVehicles() {
        return rentedVehicles;
    }

    public void setRentedVehicles(HashMap<T, Integer> rentedVehicles) {
        this.rentedVehicles = rentedVehicles;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}

package midterm_exam_prep.task2;

import java.util.HashMap;
import java.time.*;

public abstract class Vehicle implements Rentable {
    private String vehicleId;
    private String name;
    private double rentalRate;
    private HashMap<LocalDate,Integer> kilometersRecord;
    public Vehicle(String vehicleId, String name, double rentalRate) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.rentalRate = rentalRate;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    @Override
    public double applyDiscount(double discount) {
        return rentalRate*discount;
    }

    @Override
    public String getDescription(){
        return "Vehicle id: " + vehicleId + "\nName: " + name + "\nRental Rate: " + rentalRate + "\n";
    }

    public void addKilometers(LocalDate rentalDate, int kilometers){
        kilometersRecord.put(rentalDate,kilometers);
    }

    public int getTotalKilometers(){
        int total = 0;
        for(Integer i : kilometersRecord.values()){
            total+=i;
        }
        return total;
    }

}

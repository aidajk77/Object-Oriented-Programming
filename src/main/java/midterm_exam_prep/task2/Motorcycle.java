package midterm_exam_prep.task2;

public class Motorcycle extends Vehicle {
    private double engineCapacity;
    public Motorcycle(String vehicleId, String name, double rentalRate, double engineCapacity) {
        super(vehicleId, name, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Engine capacity: " + engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

}

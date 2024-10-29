package lab5;

public abstract class Vehicle {
    private String modelName;
    private int mileage;
    private int health;
    private int expectedLifespan;
    public Vehicle(String modelName){
        this.modelName = modelName;
        this.mileage = 0;
        this.health = 100;
    }
    public Vehicle(String modelName, int mileage, int health){
        this.modelName = modelName;
        this.mileage = mileage;
        this.health = health;
    }
    public String getModelName() {
        return this.modelName;
    }
    public int getMileage() {
        return this.mileage;
    }
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        if(health > 0 && health < 100){
            this.health = health;
        }
        else{
            this.health = 100;
        }
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setExpectedLifespan(int expectedLifespan) {
        this.expectedLifespan = expectedLifespan;
    }
    public int getExpectedLifespan() {
       return this.expectedLifespan;
    }
    public abstract String service();
    public abstract int expectedLifespan();
    public boolean needsMaintenance() {
        if(this.getHealth() < 70) return true;
        return false;
    }
    public int calculateRemainingLifespan() {
        int remainingLifespan;
        if(this.getHealth() < 50){
            remainingLifespan=this.getExpectedLifespan()/this.getHealth()-this.getMileage();
        }else{
            remainingLifespan=this.getExpectedLifespan()-this.getMileage();
        }
        return remainingLifespan;
    }
    public void simulateYear(){
        if(2*this.calculateRemainingLifespan()<this.expectedLifespan()){
            this.setHealth(this.getHealth()-5);
        }
        this.setMileage(this.getMileage()+5000);
        this.setHealth(this.getHealth()-2);
    }
    public void performMaintenance(Vehicle vehicle){
        if(vehicle instanceof Car){
            Car car = (Car)vehicle;
            System.out.println(car.repair());
            car.drive(10);
        }
        if(vehicle instanceof Truck){
            Truck truck = (Truck)vehicle;
            System.out.println(truck.repair());
            truck.haul(100);
        }
        if(vehicle instanceof Motorcycle){
            Motorcycle motorcycle = (Motorcycle)vehicle;
            motorcycle.race(10);
        }
    }
}

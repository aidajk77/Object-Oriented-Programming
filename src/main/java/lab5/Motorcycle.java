package lab5;

public class Motorcycle extends Vehicle {
    public Motorcycle(String modelName) {
        super(modelName);
    }
    public Motorcycle(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String service() {
        return "Lubricating the chain and tuning the engine for " + this.getModelName() + "which has " + this.getMileage() + " miles and its health is" + this.getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 50000;
    }

    public void race(int raceMiles){
        this.setMileage(this.getMileage() + raceMiles);
        this.setHealth(this.getHealth() - 5);
        if(this.getHealth() < 40){
            this.setExpectedLifespan(this.getExpectedLifespan() - 5000);
        }
    }
}

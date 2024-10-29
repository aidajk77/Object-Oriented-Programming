package lab5;

public class Truck extends Vehicle implements Repairable{
    public Truck(String modelName) {
        super(modelName);
    }
    public Truck(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String repair() {
        return "Engine overhauled and tires replaced for " + this.getModelName();
    }

    @Override
    public String service() {
        return "General service for trucks for " + this.getModelName() + " which has " + this.getMileage() + " miles and its health is " + this.getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 300000;
    }
    public void haul(int loadWeight){
        if(loadWeight > 50000){
            this.setHealth(this.getHealth()-10);
        }
        if(this.getHealth()<30){
            this.setExpectedLifespan(this.getExpectedLifespan()-20000);
        }
    }

}

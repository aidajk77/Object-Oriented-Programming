package lab5;

public class Car extends Vehicle implements Repairable{
    public Car(String modelName){
        super(modelName);
    }
    public Car(String modelName, int mileage, int health){
        super(modelName, mileage, health);
    }

    @Override
    public String repair() {
        return "Engine tuned and oil changed for "+getModelName();
    }

    @Override
    public String service() {
        return "Checking engine, changing oil for "+getModelName()+" which has "+getMileage()+" miles and its health is "+getHealth();
    }

    @Override
    public int expectedLifespan() {

        return 150000;
    }

    public void drive(int miles){
        this.setMileage(this.getMileage()+miles);
        this.setHealth(this.getHealth()-1);
        if(this.getHealth()<30){
            this.setExpectedLifespan(this.getExpectedLifespan()-10000);
        }

    }

}

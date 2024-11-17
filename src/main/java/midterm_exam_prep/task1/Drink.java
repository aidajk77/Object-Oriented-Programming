package midterm_exam_prep.task1;

public class Drink extends MenuItem {
    private double volume_in_mm;
    public Drink(String code, String name, double price, double volume_in_mm) {
        super(code, name, price);
        this.volume_in_mm = volume_in_mm;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", volume: "+volume_in_mm;
    }

    public double getVolume_in_mm() {
        return volume_in_mm;
    }

    public void setVolume_in_mm(double volume_in_mm) {
        this.volume_in_mm = volume_in_mm;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "volume_in_mm=" + volume_in_mm +
                '}';
    }
}

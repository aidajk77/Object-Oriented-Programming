package midterm_exam_prep.task1;

public abstract class MenuItem implements Billable {
    private String code;
    private String name;
    private double price;
    public MenuItem(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double applyDiscount(double discountRate) {
        return 0;
    }

    @Override
    public String getDescription() {
        return "Code: "+getCode()+", "+"Name: "+getName()+ ", Price: "+getPrice();
    }
}

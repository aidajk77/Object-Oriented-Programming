package lab4.shape;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(String color, FillType fillType, double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
    }
    public void getArea(){
        System.out.println("Area: " + this.width * this.height);
    }
}

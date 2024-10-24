package lab4.shape;

public class Circle extends Shape{
    private double radius;
    public Circle(String color, FillType filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
    }
    public void getArea(){
        System.out.println("Area: " + Math.PI * this.radius * this.radius);

    }
    public static double calculateCircumference(double pi, double r){
        return 2*pi*r;
    }
    public static double calculateCircumference(double r){
        return 2*Math.PI*r;
    }
}

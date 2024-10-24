package lab4.shape;

public class Main {
    public static void main(String[] args) {
        Circle a = new Circle("yellow", FillType.FILLED, 3);
        Rectangle b = new Rectangle("red", FillType.NOT_FILLED,1.4, 2);
        a.displayInfo();
        b.displayInfo();
        a.getArea();
        b.getArea();
        System.out.println(Circle.calculateCircumference(3.14,3));
    }
}

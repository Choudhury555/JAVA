package BASIC;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle",5);
        circle.displayInfo();

        Shape rectangle = new Rectangle("Rectangle",5,6);
        rectangle.displayInfo();
    }
}

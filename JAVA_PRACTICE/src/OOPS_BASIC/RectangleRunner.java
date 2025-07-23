package OOPS_BASIC;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12,15);
        System.out.println(rectangle);

        rectangle.setWidth(25);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle);
    }
}

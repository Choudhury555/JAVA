package OOPS_BASIC;

public class SquareRunner {
    public static void main(String[] args) {
        Square sq = new Square(-1);
        Square sq1 = new Square(5);

        System.out.println(sq.calculateArea());
        System.out.println(sq.calculatePerimeter());

        System.out.println(sq1.calculateArea());
        System.out.println(sq1.calculatePerimeter());
    }
}

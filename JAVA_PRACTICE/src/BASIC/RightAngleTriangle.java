package BASIC;

public class RightAngleTriangle {
    public static void main(String[] args) {
        System.out.println(isRightAngleTriangle(5, 6, 4));
    }

    private static boolean isRightAngleTriangle(int side1, int side2, int side3) {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            return false;
        }

        if (check(side1, side2, side3)) {
            return true;
        }
        if (check(side1, side3, side2)) {
            return true;
        }
        if (check(side3, side2, side1)) {
            return true;
        }
        return false;
    }

    private static boolean check(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        }
        return false;
    }
}

package BASIC;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(0));
    }

    private static boolean isLeapYear(int year) {
        if (year <= 0) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}

package BASIC;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(27));
    }

    private static boolean isPerfectNumber(int n) {
        int sum = 0;

        if (n <= 0) {
            return false;
        }

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum == n;
    }
}

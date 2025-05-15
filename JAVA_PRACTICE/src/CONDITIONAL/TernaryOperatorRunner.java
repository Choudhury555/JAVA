package CONDITIONAL;

import java.util.Scanner;

public class TernaryOperatorRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int number = sc.nextInt();

        String res = number % 2 == 0 ? "EVEN" : "ODD";

        System.out.println(res);
    }
}

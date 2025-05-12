package BASIC;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {
    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00","7.5");

        BigDecimal totalAMount = calculator.calculateTotalValue(5);
        System.out.println(totalAMount);
    }
}

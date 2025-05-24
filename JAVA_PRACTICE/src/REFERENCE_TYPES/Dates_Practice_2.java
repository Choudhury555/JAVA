package REFERENCE_TYPES;

import java.time.LocalDate;

public class Dates_Practice_2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = LocalDate.of(2025,5,23);
        System.out.println(yesterday);

        System.out.println(today.withYear(2026));
        System.out.println(today.withMonth(9));
        System.out.println(today.withDayOfMonth(12));

        System.out.println(today.withDayOfYear(12));

        System.out.println(today.isBefore(yesterday));
        System.out.println(today.isAfter(yesterday));
    }
}

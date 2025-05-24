package REFERENCE_TYPES;

import java.time.LocalDate;

public class Dates_Practice_1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getYear());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());

        System.out.println(today.isLeapYear());

        System.out.println(today.lengthOfYear());
        System.out.println(today.lengthOfMonth());

        System.out.println(today.plusDays(90));
        System.out.println(today.plusMonths(2));
        System.out.println(today.plusYears(48));

        System.out.println(today.minusDays(90));
        System.out.println(today.minusMonths(2));
        System.out.println(today.minusYears(48));
        /////////////////
        //same methods are there for  (LocalDateTime)
    }
}

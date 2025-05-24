package REFERENCE_TYPES;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dates_Practice {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);//2025-05-24

        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println(dateAndTime);//2025-05-24T13:31:40.294576

        LocalTime time = LocalTime.now();
        System.out.println(time);//13:32:40.345223
    }
}

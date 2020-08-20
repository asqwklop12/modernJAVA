package chapter12.paring_formatting;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Change2 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2017, 9, 21);
        LocalDate date2 = date1.plusWeeks(1);
        LocalDate date3 = date2.minusYears(6);
        LocalDate date4 = date3.plus(6, ChronoUnit.MONTHS);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
    }
}

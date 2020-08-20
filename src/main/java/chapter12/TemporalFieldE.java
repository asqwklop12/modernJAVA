package chapter12;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TemporalFieldE {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 8, 26);
        int year = date.get(ChronoField.YEAR);
        int month = date.get(ChronoField.MONTH_OF_YEAR);
        int day = date.get(ChronoField.DAY_OF_MONTH);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}

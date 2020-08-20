package chapter12.paring_formatting;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Change {
    public static void main(String[] args) {
        // 강제로 바꾸기
        LocalDate date1 = LocalDate.of(2017, 9, 21);
        LocalDate date2 = date1.withYear(2011);
        LocalDate date3 = date2.withDayOfMonth(25);
        LocalDate date4 = date3.with(ChronoField.MONTH_OF_YEAR, 2);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
    }
}

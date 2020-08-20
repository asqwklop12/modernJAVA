package chapter12.temporalAdjusters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pattern {

    public DateTimeFormatter formatter() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    public LocalDate date1() {
        return LocalDate.of(2014, 3, 18);
    }

    public String formattedDate() {
        return date1().format(formatter());
    }

    public LocalDate date2() {
        return LocalDate.parse(formattedDate(), formatter());
    }
}

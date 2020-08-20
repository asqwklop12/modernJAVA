package chapter12.temporalAdjusters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Locals {
    public static void main(String[] args) {
        DateTimeFormatter initialFormatter = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(".  ")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter(Locale.ITALIAN);

    }

    public DateTimeFormatter italianFormatter() {
        return DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);
    }

    public LocalDate date1() {
        return LocalDate.of(2014, 3, 18);
    }

    public String formatted() {
        return date1().format(italianFormatter());
    }

    public LocalDate date2() {
        return LocalDate.parse(formatted(), italianFormatter());
    }
}

package chapter12.temporalAdjusters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrintAndParsing {

    public LocalDate date() {
        return LocalDate.of(2014, 3, 18);
    }

    public String s1() {
        return date().format(DateTimeFormatter.BASIC_ISO_DATE);
    }

    public String s2() {
        return date().format(DateTimeFormatter.ISO_DATE_TIME);
    }

    public LocalDate date1() {
        return LocalDate.parse("20140318", DateTimeFormatter.BASIC_ISO_DATE);
    }

    public LocalDate date2() {
        return LocalDate.parse("2014-03-18", DateTimeFormatter.ISO_DATE_TIME);
    }


}

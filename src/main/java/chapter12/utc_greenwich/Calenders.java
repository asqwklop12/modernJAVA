package chapter12.utc_greenwich;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseDate;
import java.util.Locale;

public class Calenders {

    public static void main(String[] args) {
        System.out.println(new Calenders().japaneseDate());
        System.out.println(new Calenders().now());
    }

    public LocalDate date() {
        return LocalDate.of(2014, Month.MARCH, 18);
    }

    public JapaneseDate japaneseDate() {
        return JapaneseDate.from(date());
    }

    public Chronology japaneseChronology() {
        return Chronology.ofLocale(Locale.JAPAN);
    }

    public ChronoLocalDate now() {
        return japaneseChronology().dateNow();
    }
}

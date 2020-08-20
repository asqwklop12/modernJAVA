package chapter12.temporalAdjusters.time_zone;

import java.time.*;
import java.util.TimeZone;

public class Use {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
        ZonedDateTime zdt1 = date.atStartOfDay(new Use().romeZone());
        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
        ZonedDateTime zdt2 = dateTime.atZone(new Use().romeZone());
        Instant instant = Instant.now();
        ZonedDateTime zdt3 = instant.atZone(new Use().romeZone());
        System.out.println(zdt1);
        System.out.println(zdt2);
        System.out.println(zdt3);

        Instant instant1 = Instant.now();
        LocalDateTime timeFromInstant = LocalDateTime.ofInstant(instant1, new Use().romeZone());
        System.out.println(timeFromInstant);
    }

    public ZoneId romeZone() {
        return ZoneId.of("Europe/Rome");
    }

    public ZoneId zoneId() {
        return TimeZone.getDefault().toZoneId();
    }
}

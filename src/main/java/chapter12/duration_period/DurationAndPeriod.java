package chapter12.duration_period;

import java.time.*;

public class DurationAndPeriod {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(13, 45, 27);
        Duration d1 = Duration.between(time1, time2);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.of(2017, 8, 21, 13, 45, 9);

        Duration d2 = Duration.between(dateTime1, dateTime2);

        Instant instant1 = Instant.now();
        Instant instant2 = Instant.ofEpochSecond(3);
        Duration d3 = Duration.between(instant1, instant2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        Period tenDays = Period.between(LocalDate.of(2017, 9, 11),
                LocalDate.of(2017, 9, 21));
        System.out.println(tenDays);
    }
}

package chapter12.duration_period;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Make {
    public static void main(String[] args) {
        Duration threeMinutes = Duration.ofMinutes(3);
        Duration threeMinutes2 = Duration.of(3, ChronoUnit.MINUTES);
        System.out.println(threeMinutes);
        System.out.println(threeMinutes2);

        Period tenDays = Period.ofDays(10);
        Period threeWeeks = Period.ofWeeks(3);
        Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);
        System.out.println(tenDays);
        System.out.println(threeWeeks);
        System.out.println(twoYearsSixMonthsOneDay);
    }
}

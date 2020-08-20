package chapter12;

import java.time.Instant;

public class InstantE {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(3);
        Instant instant1 = Instant.ofEpochSecond(3, 0);
        Instant instant2 = Instant.ofEpochSecond(2, 1_000_000_000);
        Instant instant3 = Instant.ofEpochSecond(4, 1_000_000_000);
        System.out.println(instant);
        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);

//        int day = Instant.now().get(ChronoField.DAY_OF_MONTH);
//        System.out.println(day);

    }
}

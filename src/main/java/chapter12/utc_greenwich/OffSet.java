package chapter12.utc_greenwich;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffSet {
    public ZoneOffset newYorkOffset() {
        return ZoneOffset.of("-05:00");
    }

    public LocalDateTime dateTime() {
        return LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
    }

    public OffsetDateTime dateTImeInNewYork() {
        return OffsetDateTime.of(dateTime(), newYorkOffset());
    }
}

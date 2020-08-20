package chapter12.utc_greenwich;

import java.time.chrono.HijrahDate;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class HijrahDateE {

    public static void main(String[] args) {
        HijrahDate romanDate = new HijrahDateE().ramadanDate();
        System.out.println("Ramadan starts on " +
                IsoChronology.INSTANCE.date(romanDate) +
                " and ends on" +
                IsoChronology.INSTANCE.date(
                        romanDate.with(
                                TemporalAdjusters.lastDayOfMonth()
                        )
                )
        );
    }

    public HijrahDate ramadanDate() {
        return HijrahDate.now().with(ChronoField.DAY_OF_MONTH, 1)
                .with(ChronoField.MONTH_OF_YEAR, 9);
    }
}

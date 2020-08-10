package chapter06;

import java.util.List;
import java.util.stream.Collector;

import static java.util.stream.Collectors.reducing;

public class OtherWay {
    public static <T> Collector<T, ?, Long> counting() {
        return reducing(0L, e -> 1L, Long::sum);
    }

    public int totalCalories(List<Dish> menu) {
        return menu.stream().collect(reducing(0,
                Dish::getCalories,
                Integer::sum));
    }

    public int totalCalories2(List<Dish> menu) {
        return menu.stream().mapToInt(Dish::getCalories).sum();
    }
}

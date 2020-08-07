package chapter05.streams;

import java.util.List;

public class Quiz3 {

    public int count(List<Dish> menu) {
        return menu.stream()
                .map(d -> 1)
                .reduce(0, (a, b) -> a + b);
    }

    public long count2(List<Dish> menu) {
        return menu.stream().count();
    }
}

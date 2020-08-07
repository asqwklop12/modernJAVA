package chapter05.streams;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamSkip {
    public List<Dish> skip(List<Dish> menu) {
        List<Dish> dishes = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(toList());
        return dishes;
    }
}

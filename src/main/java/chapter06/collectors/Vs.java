package chapter06.collectors;

import chapter06.Dish;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Vs {

    // 기존
    public List<Dish> dishes(Stream<Dish> menuStream) {
        return menuStream.collect(toList());
    }

    // 변경 후
    public List<Dish> newDishes(Stream<Dish> menuStream) {
        return menuStream.collect(new ToListCollectors<>());
    }

}

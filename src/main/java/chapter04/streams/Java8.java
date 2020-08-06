package chapter04.streams;

import chapter04.Dish;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Java8 {

    // 일반 stream 버전
    public List<String> lowCaloriesDishesNamesOrderByCalories(List<Dish> menu) {
        return menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());
    }

    // 일반 stream 버전
    public List<String> lowCaloriesDishesNamesOrderByCaloriesAsParallel(List<Dish> menu) {
        return menu.parallelStream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());
    }
}

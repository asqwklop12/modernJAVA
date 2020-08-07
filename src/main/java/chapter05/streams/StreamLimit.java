package chapter05.streams;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamLimit {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER)
        );

        List<Dish> dishes = specialMenu
                .stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .collect(toList());
    }
}

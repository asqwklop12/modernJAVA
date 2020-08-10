package chapter06.many_level;

import chapter05.streams.Type;
import chapter06.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class SubGroup {

    public static Map<Type, Long> typesCount(List<Dish> menu) {
        return menu.stream().collect(
                groupingBy(Dish::getType, counting())
        );
    }

    public static Map<Type, Optional<Dish>> mostCaloricByType(List<Dish> menu) {
        return menu.stream()
                .collect(groupingBy(Dish::getType,
                        maxBy(comparing(Dish::getCalories))));
    }

    public static Map<Type, Dish> mostCaloricByType2(List<Dish> menu) {
        return menu.stream()
                .collect(groupingBy(Dish::getType,
                        collectingAndThen(
                                maxBy(comparing(Dish::getCalories)),
                                Optional::get
                        )));
    }

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("season", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );
        System.out.println(typesCount(menu));
        System.out.println(mostCaloricByType(menu));
        System.out.println(mostCaloricByType2(menu));
    }
}

package chapter06.partition;

import chapter05.streams.Type;
import chapter06.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class Functions {

    public static Map<Boolean, List<Dish>> partitionedMenu(List<Dish> menu) {
        return menu.stream().collect(partitioningBy(Dish::isVegetarian));
    }

    public static Map<Boolean, Map<Type, List<Dish>>> vegetarianDishesByType(List<Dish> menu) {
        return menu.stream()
                .collect(
                        partitioningBy(Dish::isVegetarian,
                                groupingBy(Dish::getType))
                );
    }

    public static Map<Boolean, Dish> mostCaloricPartitionedByVegetarian(List<Dish> menu) {
        return menu.stream().collect(
                partitioningBy(Dish::isVegetarian,
                        collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get))
        );
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

        System.out.println(partitionedMenu(menu));
        List<Dish> vegetarianDishes = partitionedMenu(menu).get(true);
        System.out.println(vegetarianDishes);

        List<Dish> vegetarianDishes2 = menu.stream().filter(Dish::isVegetarian).collect(toList());
        System.out.println(vegetarianDishes2);
        System.out.println(vegetarianDishesByType(menu));
        System.out.println(mostCaloricPartitionedByVegetarian(menu));
    }
}

package chapter04.streams;

import chapter04.Dish;
import chapter04.Type;

import java.util.Arrays;
import java.util.List;

public class Main {
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

        System.out.println(new Java7().lowCaloriesDishesNamesOrderByCalories(menu));
        System.out.println(new Java8().lowCaloriesDishesNamesOrderByCalories(menu));
        System.out.println(new Java8().lowCaloriesDishesNamesOrderByCaloriesAsParallel(menu));
    }
}

package chapter05.streams;


import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class TakeWhiles {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER)
        );


        List<String> filterMenu = specialMenu
                .stream()
                .filter(dish -> dish.getCalories() < 320)
                .map(Dish::getName)
                .collect(toList());
        System.out.println(filterMenu);

        // takeWhile
        List<String> sliceMenu1 = specialMenu
                .stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .map(Dish::getName)
                .collect(toList());
        System.out.println(sliceMenu1);
        // dropWile
        List<String> slicedMenu2 = specialMenu
                .stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .map(Dish::getName)
                .collect(toList());
        System.out.println(slicedMenu2);

    }
}

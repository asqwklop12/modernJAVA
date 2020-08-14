package chapter09;


import chapter03.lamdba.Apple;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;

public class Group {
    Map<CaloricLevel, List<Dish>> dishesByCaloricLevel(List<Dish> menu) {
        return menu.stream()
                .collect(
                        groupingBy(dish -> {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        })
                );
    }

    // => 리펙토링 후
    Map<CaloricLevel, List<Dish>> dishesByCaloricLevel2(List<Dish> menu) {
        return menu.stream()
                .collect(groupingBy(Dish::getCaloricLevel));
    }

    public void sortApple(List<Apple> inventory) {
        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        //=>
        inventory.sort(comparing(Apple::getWeight));
    }

    public int totalCalories(List<Dish> menu) {
        return menu.stream().map(Dish::getCalories)
                .reduce(0, (c1, c2) -> c1 + c2);
    }

    // => 리펙토링
    public int totalCalories2(List<Dish> menu) {
        return menu.stream().collect(Collectors.summingInt(Dish::getCalories));
    }
}

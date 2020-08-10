package chapter06.groupingby;

import chapter05.streams.Type;
import chapter06.CaloricLevel;
import chapter06.Dish;

import java.util.*;

import static java.util.stream.Collectors.*;

public class OtherCollectors {

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
    }

    public Map<Type, Integer> totalCaloriesByType(List<Dish> menu) {
        return menu.stream().collect(groupingBy(Dish::getType,
                summingInt(Dish::getCalories)));
    }

    public Map<Type, Set<CaloricLevel>> caloricLevelsByType(List<Dish> menu) {
        return menu.stream().collect(
                groupingBy(Dish::getType, mapping(dish ->
                        {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        },
                        toSet())));
    }

    public Map<Type, Set<CaloricLevel>> caloricLevelByType(List<Dish> menu) {
        return menu.stream().collect(
                groupingBy(Dish::getType, mapping(dish -> {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        },
                        toCollection(HashSet::new))));
    }

}

package chapter06.gouping;

import chapter05.streams.Type;
import chapter06.CaloricLevel;
import chapter06.Dish;

import java.util.*;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.*;

public class Group {

    public static Map<Type, List<String>> dishNamesByType(List<Dish> menu) {
        return menu.stream()
                .collect(groupingBy(Dish::getType, mapping(Dish::getName, toList())));
    }

    public static Map<Type, Set<String>> dishNamesByType2(List<Dish> menu, Map<String, List<String>> dishTags) {
        return menu.stream()
                .collect(groupingBy(Dish::getType,
                        flatMapping(dish -> dishTags.get(dish.getName()).stream(), toSet())));
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

        Map<String, List<String>> dishTags = new HashMap<>();
        dishTags.put("pork", asList("greasy", "salty"));
        dishTags.put("beef", asList("salty", "roasted"));
        dishTags.put("chicken", asList("fried", "crisp"));
        dishTags.put("french fries", asList("greasy", "fried"));
        dishTags.put("rice", asList("light", "natural"));
        dishTags.put("season fruit", asList("fresh", "natural"));
        dishTags.put("pizza", asList("tasty", "salty"));
        dishTags.put("prawns", asList("tasty", "roasted"));
        dishTags.put("salmon", asList("delicious", "french"));


        System.out.println(dishNamesByType2(menu, dishTags));
    }

    // 내가 원하는 것은 만족되지 않으면 빈 그룹이라도 보여줬으면 좋겠다!
//    public Map<Type,List<Dish>> caloricDishesByType(List<Dish> menu) {
//        return menu.stream()
//                .collect(
//                        groupingBy(Dish::getType,
//                        filtering(dish -> dish.getCalories(),toList())));
//    }

    public Map<Type, List<Dish>> dishesByType(List<Dish> menu) {
        return menu.stream().collect(groupingBy(Dish::getType));
    }

    public Map<CaloricLevel, List<Dish>> dishesByCaloricLevel(List<Dish> menu) {
        return menu.stream().collect(
                groupingBy(dish -> {
                    if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                    else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
                }));
    }

    // 만족하지 않는 그룹은 등록되지 않는다.
    public Map<Type, List<Dish>> caloricDishesByType(List<Dish> menu) {
        return menu.stream().filter(dish -> dish.getCalories() > 500)
                .collect(groupingBy(Dish::getType));
    }

}

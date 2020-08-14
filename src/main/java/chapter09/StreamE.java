package chapter09;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamE {

    public List<String> version1(List<Dish> menu) {
        List<String> dishesNames = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() > 300) {
                dishesNames.add(dish.getName());
            }
        }
        return dishesNames;
    }

    public List<String> version2(List<Dish> menu) {
        return menu.parallelStream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .collect(toList());
    }
}

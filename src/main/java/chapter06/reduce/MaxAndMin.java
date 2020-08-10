package chapter06.reduce;

import chapter06.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;

public class MaxAndMin {

    public Comparator<Dish> dishCaloriesComparator() {
        return Comparator.comparingInt(Dish::getCalories);
    }

    public Optional<Dish> mostCalorieDish(List<Dish> menu) {
        return menu.stream()
                .collect(maxBy(dishCaloriesComparator()));
    }

}

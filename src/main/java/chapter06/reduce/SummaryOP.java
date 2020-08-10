package chapter06.reduce;

import chapter06.Dish;

import java.util.IntSummaryStatistics;
import java.util.List;

import static java.util.stream.Collectors.*;

public class SummaryOP {

    public int totalCalories(List<Dish> menu) {
        return menu.stream().collect(summingInt(Dish::getCalories));
    }

    public double avgCalories(List<Dish> menu) {
        return menu.stream().collect(averagingInt(Dish::getCalories));
    }

    public IntSummaryStatistics menuStatistics(List<Dish> menu) {
        return menu.stream().collect(summarizingInt(Dish::getCalories));
    }

}

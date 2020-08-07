package chapter05.streams;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Mapping {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
        List<Integer> wordLength = words.stream()
                .map(String::length)
                .collect(toList());

    }

    public List<String> getDishNames(List<Dish> menu) {
        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(toList());
        return dishNames;
    }

    public List<Integer> dishesNameLength(List<Dish> menu) {
        List<Integer> dishesNameLength = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(toList());
        return dishesNameLength;
    }
}

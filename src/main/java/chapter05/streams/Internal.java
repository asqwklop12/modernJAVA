package chapter05.streams;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Internal {
    //내부 반복
    public List<Dish> iterate(List<Dish> menu) {
        List<Dish> vegetarianDishes =
                menu.stream()
                        .filter(Dish::isVegetarian)
                        .collect(toList());
        return vegetarianDishes;
    }
}

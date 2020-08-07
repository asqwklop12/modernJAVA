package chapter05.streams;

import java.util.List;
import java.util.Optional;

public class ElementSearch {

    public void optionals(List<Dish> menu) {
        Optional<Dish> dish = menu.stream()
                .filter(Dish::isVegetarian)
                .findAny();
    }
}

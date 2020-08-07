package chapter05.streams;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Quiz1 {

    public List<Dish> q(List<Dish> menu) {
        List<Dish> dishes = menu.stream()
                .filter(d -> d.getType().equals(Type.MEAT))
                .limit(2)
                .collect(toList());
        return dishes;
    }
}

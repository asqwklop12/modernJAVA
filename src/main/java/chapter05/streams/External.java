package chapter05.streams;

import java.util.ArrayList;
import java.util.List;

public class External {
    // 외부 반복
    public List<Dish> iterate(List<Dish> menu) {
        List<Dish> vegetarianDishes = new ArrayList<>();
        for (Dish dish : menu) {
            vegetarianDishes.add(dish);
        }
        return vegetarianDishes;
    }
}

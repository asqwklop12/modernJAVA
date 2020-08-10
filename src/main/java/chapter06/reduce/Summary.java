package chapter06.reduce;

import chapter06.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class Summary {


    public long howManyDishes(List<Dish> menu) {
        return menu.stream().collect(Collectors.counting());
    }
//    ==

    public long howManyDies2(List<Dish> menu) {
        return menu.stream().count();
    }

}

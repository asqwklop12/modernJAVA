package chapter06.string;

import chapter06.Dish;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class Join {

    public String shortMenu(List<Dish> menu) {
        return menu.stream().map(Dish::getName)
                .collect(joining());
    }

//    public String shortMenu2(List<Dish> menu) {
//        return menu.stream().collect(joining());
//    }

    public String shortMenuWithComma(List<Dish> menu) {
        return menu.stream().map(Dish::getName).collect(joining(", "));
    }
}

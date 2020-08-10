package chapter06.all;

import chapter06.Dish;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.reducing;

public class Reducing {

    public int totalCalories(List<Dish> menu) {
        return menu.stream().collect(reducing(
                0, Dish::getCalories, (i, j) -> i + j));
    }
    // 1) 리듀싱 연산의 시작값
    // 2) 정수로 변환할때 상용한 변환 함수(map)
    // 3) 같은 종류의 두 항목을 하나의 값으로 더하는 부분

    public Optional<Dish> mostCalorieDish(List<Dish> menu) {
        return menu.stream().collect(reducing(
                (d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2
        ));
    }
}

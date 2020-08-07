package chapter05.streams;

import java.util.List;

public class SearchingAndMatching {

    // 프리디케이트가 적어도 한 요소와 일치하는지 확인
    public void anyMatches(List<Dish> menu) {
        if (menu.stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is (somewhat) vegetarian friendly!");
        }
    }

    // 프리디케이트가 모든 요소와 일치하는지 검사
    public void allMatches(List<Dish> menu) {
        boolean isHealth = menu.stream()
                .allMatch(dish -> dish.getCalories() < 1000);
    }

    // 반대
    public void noneMatches(List<Dish> menu) {
        menu.stream()
                .noneMatch(dish -> dish.getCalories() >= 1000);
    }


}

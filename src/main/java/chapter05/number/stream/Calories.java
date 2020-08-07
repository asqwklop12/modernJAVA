package chapter05.number.stream;

import chapter05.streams.Dish;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Calories {
    public int reduceV(List<Dish> menu) {
        return menu.stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum);
    }

    // 이렇게는 안됨 ㅜㅜ
//    public int failedBoxV(List<Dish> menu) {
//        return menu.stream()
//                .map(Dish::getCalories)
//                .sum();
//    }

    // 가능
    public int boxV(List<Dish> menu) {
        return menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
    }

    // 스트림을 숫자 스트립으로 변환
    public IntStream intStream(List<Dish> menu) {
        return menu.stream().mapToInt(Dish::getCalories);
    }

    // 숫자 스트립을 스트림으로 변환
    public Stream<Integer> stream(IntStream intStream) {
        return intStream.boxed();
    }

    public OptionalInt maxCalories(List<Dish> menu) {
        return menu.stream()
                .mapToInt(Dish::getCalories)
                .max();
    }

    public int max(OptionalInt maxCalories) {
        return maxCalories.orElse(1);
    }


}

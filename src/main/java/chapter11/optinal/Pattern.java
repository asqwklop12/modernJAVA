package chapter11.optinal;

import java.util.Optional;

public class Pattern {

    public Optional<Car> empty() {
        return Optional.empty();
    }

    // null 이 아닌 값으로 Optional 만들기
    public Optional<Car> ofCar(Car car) {
        return Optional.of(car);
    }

    // null값으로 Optional 만들기
    // 비어 있으면 empty 반환
    public Optional<Car> ofNullableCar(Car car) {
        return Optional.ofNullable(car);
    }

}

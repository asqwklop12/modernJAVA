package chapter10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

import static java.util.stream.Collectors.groupingBy;

public class CollectDSL {

    public Map<String, Map<Color, List<Car>>> carsByBrandAndColor(List<Car> cars) {
        return cars.stream().collect(groupingBy(Car::getBrand,
                groupingBy(Car::getColor)));
    }

    public Collector<? super Car, ?, Map<String, Map<Color, List<Car>>>> carsByBrandAndColor2(List<Car> cars) {
        return groupingBy(Car::getBrand, groupingBy(Car::getColor));
    }

}

package chapter03.meathod;

import chapter03.lamdba.Apple;

import java.util.Comparator;

public class ComparatorE {

    public static void main(String[] args) {
        Comparator<Apple> c = Comparator.comparing(Apple::getWeight);

        // 역정렬
        Comparator<Apple> re = Comparator.comparing(Apple::getWeight).reversed();

        // 추가 정렬
        Comparator<Apple> add = Comparator.comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getColor);

    }
}

package chapter03.meathod;

import chapter02.Color;
import chapter03.lamdba.Apple;

import java.util.function.Predicate;

public class PredicateE {
    public static void main(String[] args) {
        Predicate<Apple> redApple = apple -> apple.getColor().equals(Color.RED);
        Predicate<Apple> notRedApple = redApple.negate();

        Predicate<Apple> redAndHeavyApple =
                redApple.and(apple -> apple.getWeight() > 150);

        Predicate<Apple> redAndHeavyAppleOrGreen =
                redApple.and(apple -> apple.getWeight() > 150)
                        .or(apple -> Color.GREEN.equals(apple.getWeight()));
    }
}

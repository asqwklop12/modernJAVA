package chapter02.quiz.step4;

import chapter02.Apple;
import chapter02.Color;

public class AppleRedAndHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150 && Color.RED.equals(apple.getColor());
    }
}

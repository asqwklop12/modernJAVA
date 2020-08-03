package chapter02.step4;

import chapter02.Apple;
import chapter02.Color;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return (Color.GREEN).equals(apple.getColor());
    }
}

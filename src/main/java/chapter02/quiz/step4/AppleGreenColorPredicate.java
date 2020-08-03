package chapter02.quiz.step4;

import chapter02.Apple;
import chapter02.Color;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}

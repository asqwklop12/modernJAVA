package chapter02.quiz.step4;

import chapter02.Apple;

@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);
}

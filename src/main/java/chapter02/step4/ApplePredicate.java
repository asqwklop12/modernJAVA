package chapter02.step4;

import chapter02.Apple;

@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);
}

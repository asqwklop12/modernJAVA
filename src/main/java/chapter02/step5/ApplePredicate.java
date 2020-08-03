package chapter02.step5;

import chapter02.Apple;

@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);
}

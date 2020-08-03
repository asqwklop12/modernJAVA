package chapter02.quiz.step4;

import chapter02.Apple;

public class AppleSimpleFormatter implements AppleFormatter{

    @Override
    public String accept(Apple apple) {
        return "An Apple of " + apple.getWeight() + "g";
    }
}

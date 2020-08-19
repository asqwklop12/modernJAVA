package chapter11.optinal;

import java.util.Optional;

public class Person {
    private Optional<Car> car;
    private int age;

    public int getAge() {
        return age;
    }

    public Optional<Car> getCar() {
        return car;
    }
}

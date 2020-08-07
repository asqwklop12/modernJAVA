package chapter05.infinte.steams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Iterate {

    public void iterate() {
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
    }

    public void filter() {
        IntStream.iterate(0, n -> n < 100, n -> n + 4)
                .forEach(System.out::println);
    }

    // 불가능! 아래코드는 종료되지 않기 때문이다.
    public void can() {
        IntStream.iterate(0, n -> n + 4)
                .filter(n -> n < 100)
                .forEach(System.out::println);
    }

    public void isCan() {
        IntStream.iterate(0, n -> n + 4)
                .takeWhile(n -> n < 100)
                .forEach(System.out::println);
    }
}

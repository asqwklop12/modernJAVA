package chapter05.number.range;

import java.util.stream.IntStream;

public class Ranges {

    public IntStream evenNumbers() {
        return IntStream.rangeClosed(1, 100)
                .filter(i -> i % 2 == 0);
    }

    public void print(IntStream evenNumbers) {
        System.out.println(evenNumbers.count());
    }
}

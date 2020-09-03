package chapter19.streams.function;

import java.util.stream.IntStream;

public class Step1 {
    static IntStream numbers() {
        return IntStream.iterate(2, n -> n + 1);
    }
}

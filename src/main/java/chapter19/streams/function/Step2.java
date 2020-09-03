package chapter19.streams.function;

import java.util.stream.IntStream;

public class Step2 {
    static int head(IntStream numbers) {
        return numbers.findFirst().getAsInt();
    }
}

package chapter19.streams.function;

import java.util.stream.IntStream;

public class Step3 {
    static IntStream tail(IntStream numbers) {
        return numbers.skip(1);
    }

    public static void print() {
        IntStream numbers = Step1.numbers();
        int head = Step2.head(numbers);
        IntStream filtered = tail(numbers).filter(n -> n % head != 0);
    }

}

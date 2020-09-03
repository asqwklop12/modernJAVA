package chapter19.streams.function;

import java.util.stream.IntStream;

public class Step4 {

    static IntStream primes(IntStream numbers) {
        int head = Step2.head(numbers);
        return IntStream.concat(
                IntStream.of(head),
                primes(Step3.tail(numbers).filter(n -> n % head != 0))
        );
    }
}

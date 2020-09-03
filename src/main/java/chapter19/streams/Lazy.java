package chapter19.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lazy {

    public static Stream<Integer> primes(int n) {
        return Stream.iterate(2, i -> i + 1)
                .filter(Lazy::isPrime)
                .limit(n);
    }

    public static boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt(candidate);
        return IntStream.rangeClosed(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }
}

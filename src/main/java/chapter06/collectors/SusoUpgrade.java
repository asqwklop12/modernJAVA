package chapter06.collectors;

import chapter03.custom.predicate.Predicate;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static chapter06.groupingby.Numbering.isPrime2;
import static java.util.stream.Collectors.partitioningBy;

public class SusoUpgrade {
    public static boolean isPrimeX(List<Integer> primes, int candidate) {
        return primes.stream().noneMatch(i -> candidate % i == 0);
    }

    public static boolean isPrimeX2(List<Integer> primes, int candidate) {
        int candidateRoot = (int) Math.sqrt(candidate);
        return primes.stream()
                .takeWhile(i -> i <= candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }

    public static <A> List<A> takeWhile(List<A> list, Predicate<A> p) {
        int i = 0;
        for (A item : list) {
            if (!p.test(item)) {
                return list.subList(0, i);
            }
            i++;
        }
        return list;
    }

    public Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed()
                .collect(partitioningBy(candidate -> isPrime2(candidate)));
    }
}

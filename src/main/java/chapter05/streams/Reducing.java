package chapter05.streams;

import java.util.List;
import java.util.Optional;

public class Reducing {

    public int basic(List<Integer> numbers) {
        int sum = 0;
        for (Integer x : numbers) {
            sum += x;
        }
        return sum;
    }

    public int reducingVersion(List<Integer> numbers) {
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    public int reducingVersion2(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

    public int other(List<Integer> numbers) {
        return numbers.stream().reduce(1, (a, b) -> a * b);
    }

    public void notInitial(List<Integer> numbers) {
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
    }


    public void max(List<Integer> numbers) {
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
    }

    public void min(List<Integer> numbers) {
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
    }

}

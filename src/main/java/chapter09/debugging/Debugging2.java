package chapter09.debugging;

import java.util.Arrays;
import java.util.List;

public class Debugging2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.stream().map(Debugging2::divideByZero).forEach(System.out::println);
    }

    public static int divideByZero(int n) {
        return n / 0;
    }
}

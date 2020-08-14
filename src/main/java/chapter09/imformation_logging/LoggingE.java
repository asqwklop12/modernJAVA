package chapter09.imformation_logging;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class LoggingE {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);

        numbers.stream()
                .peek(x -> System.out.println("from stream: " + x))
                .map(x -> x + 17)
                .peek(x -> System.out.println("from map: " + x))
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println("from filter: " + x))
                .limit(3)
                .peek(x -> System.out.println("from limit: " + x))
                .collect(toList());
//                .forEach(System.out::println);
    }
}

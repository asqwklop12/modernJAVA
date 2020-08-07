package chapter05.streams;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Quiz2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> one = numbers.stream()
                .map(i -> i * i)
                .collect(toList());
        System.out.println(one);

        List<Integer> first = Arrays.asList(1, 2, 3);
        List<Integer> second = Arrays.asList(3, 4);
        List<int[]> two = first.stream()
                .flatMap(i -> second.stream().map(j -> new int[]{i, j}))
                .collect(toList());

        System.out.println(two);
        List<int[]> three = first.stream()
                .flatMap(i -> second.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j}))
                .collect(toList());
        System.out.println(three);
    }
}

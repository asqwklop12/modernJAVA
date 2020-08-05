package chapter03.custom.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> results = new ArrayList<>();
        for (T t : list) {
            results.add(f.apply(t));
        }
        return results;
    }

    public static void main(String[] args) {
        List<Integer> list = map(
                Arrays.asList("lambdas", "in", "action"),
                s -> s.length()
        );

    }
}

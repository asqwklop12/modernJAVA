package chapter03.custom.predicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Predicate<String> nonEmptyStringPredicate = s -> !s.isEmpty();
//      List<String> nonEmpty(Arrays.asList("aa","bb"), nonEmptyStringPredicate);

        Predicate<Integer> one = i -> i % 2 == 0;
        Predicate<Integer> two = (Integer i) -> i % 2 == 0;
    }

    public <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }
}

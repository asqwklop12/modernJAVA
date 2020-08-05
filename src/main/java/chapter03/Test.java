package chapter03;

import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class Test {

    // predicate
    public static boolean t(Predicate<Integer> p, int num) {
        return p.test(num);
    }

    public static Callable<String> fetch() {
        return () -> "Thicky example ;-)";
    }

    public static void process(Runnable r) {
        r.run();
    }

    public static void main(String[] args) {
        // predicate
        System.out.println(t(i -> i > 5, 10));

        process(() -> System.out.println("hello world"));

        System.out.println(fetch().toString());
    }
}

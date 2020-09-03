package chapter19.combination;

import chapter03.custom.function.Function;

public class Main {
    static <A, B, C> Function<A, C> compose(Function<B, C> g, Function<A, B> f) {
        return x -> g.apply(f.apply(x));
    }

    static <A> Function<A, A> repeat(int n, Function<A, A> f) {
        return n == 0 ? x -> x
                : compose(f, repeat(n - 1, f));
    }

    public static void main(String[] args) {
        System.out.println(repeat(3, (Integer x) -> 2 * x).apply(10));
    }
}

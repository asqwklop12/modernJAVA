package chapter03.custom.function;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}

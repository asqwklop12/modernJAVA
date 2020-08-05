package chapter03.custom.predicate;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}

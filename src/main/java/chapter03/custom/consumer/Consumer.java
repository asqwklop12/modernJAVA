package chapter03.custom.consumer;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}

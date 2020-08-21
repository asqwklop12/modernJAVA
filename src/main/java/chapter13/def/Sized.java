package chapter13.def;

public interface Sized {
    int size();

    default boolean isEmpty() {
        return size() == 0;
    }
}

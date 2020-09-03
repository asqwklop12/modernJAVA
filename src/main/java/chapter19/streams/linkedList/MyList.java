package chapter19.streams.linkedList;

import java.util.function.Predicate;

public interface MyList<T> {
    T head();

    MyList<T> tail();

    MyList<T> filter(Predicate<T> p);

    default boolean isEmpty() {
        return true;
    }

}


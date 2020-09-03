package chapter19.streams.linkedList;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class LazyList<T> implements MyList<T> {
    final T head;
    final Supplier<MyList<T>> tail;

    public LazyList(T head, Supplier<MyList<T>> tail) {
        this.head = head;
        this.tail = tail;
    }

    static <T> void printAll(MyList<T> list) {
        while (!list.isEmpty()) {
            System.out.println(list.head());
            list = list.tail();
        }
    }

    static <T> void printAll2(MyList<T> list) {
        if (list.isEmpty()) {
            return;
        }
        System.out.println(list.head());
        printAll2(list.tail());
    }

    @Override
    public T head() {
        return head;
    }

    @Override
    public MyList<T> tail() {

        return tail.get();
    }

    @Override
    public MyList<T> filter(Predicate<T> p) {
        return isEmpty() ?
                this :
                p.test(head()) ?
                        new LazyList<>(head(), () -> tail().filter(p)) :
                        tail().filter(p);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


}

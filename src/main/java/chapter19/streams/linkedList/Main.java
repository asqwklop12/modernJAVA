package chapter19.streams.linkedList;

import static chapter19.streams.linkedList.LazyList.printAll;

public class Main {

    public static LazyList<Integer> from(int n) {
        return new LazyList<>(n, () -> from(n + 1));
    }


    public static MyList<Integer> primes(MyList<Integer> numbers) {
        return new LazyList<>(
                numbers.head(),
                () -> primes(
                        numbers.tail()
                                .filter(n -> n % numbers.head() != 0)
                )
        );
    }


    public static void main(String[] args) {
        MyList<Integer> l =
                new MyLinkedList<>(5, new MyLinkedList<>(10, new Empty<>()));
        System.out.println(l.head());

        LazyList<Integer> numbers = from(2);
        int two = primes(numbers).head();
        int three = primes(numbers).tail().head();
        int four = primes(numbers).tail().tail().head();

//        System.out.println(two + " " + three + " " + four);

        printAll(primes(from(2)));
    }
}

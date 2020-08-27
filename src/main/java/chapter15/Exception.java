package chapter15;

import chapter03.custom.consumer.Consumer;

public class Exception {

    static void f(int x, Consumer<Integer> dealWithResult,
                  Consumer<Integer> dealWithException) {
        dealWithException();
    }


    private static void dealWithException() {
    }
}

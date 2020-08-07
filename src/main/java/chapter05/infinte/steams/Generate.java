package chapter05.infinte.steams;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Generate {

    public void randomNumber() {
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }

    // 서플라이어 형식으로 동작한다.
    public IntStream one() {
        return IntStream.generate(() -> 1);
    }

    public IntStream two() {
        return IntStream.generate(new IntSupplier() {
            @Override
            public int getAsInt() {
                return 2;
            }
        });
    }

    public IntSupplier fib() {
        return new IntSupplier() {
            private int previous = 0;
            private int current = 1;

            @Override
            public int getAsInt() {
                int oldPrevious = this.previous;
                int nextValue = this.previous + this.current;
                this.previous = this.current;
                this.current = nextValue;
                return oldPrevious;
            }
        };
    }

    public void print() {
        IntStream.generate(fib()).limit(10).forEach(System.out::println);
    }

}

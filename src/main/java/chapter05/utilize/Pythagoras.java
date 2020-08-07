package chapter05.utilize;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pythagoras {

    public static Stream<int[]> generateA() {
        return IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                        .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}));
    }

//    public Stream<int[]> generateSet(IntStream stream, int a) {
//        return stream.filter(b -> Math.sqrt(a*a+b*b) % 1 == 0)
//                .map(b -> new int[]{a,b, (int) Math.sqrt(a*a + b*b)});
//    }

    public static void print(Stream<int[]> pythagoreanTriples) {
        pythagoreanTriples.limit(5)
                .forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));
    }

    public static Stream<double[]> pythagoreanTriples2() {
        return IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .mapToObj(b -> new double[]{a, b, (int) Math.sqrt(a * a + b * b)})
                        .filter(t -> t[2] % 1 == 0));
    }

    public static void print2(Stream<double[]> pythagoreanTriples) {
        pythagoreanTriples.limit(5)
                .forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));
    }

    public static void main(String[] args) {

        print2(pythagoreanTriples2());
    }

    public boolean goodFiltering(int a, int b) {
        return Math.sqrt(a * a + b * b) % 1 == 0;
        // == filter(b -> Math.sqrt(a*a+b*b) % 1 == 0)
    }

    public Stream<int[]> generateB(int a) {
        return IntStream.rangeClosed(1, 100)
                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                .boxed()
                .map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)});
    }
}

package chapter05.streams;

import java.util.stream.Stream;

public class Quiz4 {

    public void fibonacci() {
        Stream.iterate(new int[]{0, 1},
                t -> new int[]{t[1], t[0] + t[1]})
                .limit(20)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));

    }
}

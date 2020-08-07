package chapter05.make.steams;

import java.util.stream.Stream;

public class MakeValue {

    public void stream() {
        Stream<String> stream = Stream.of("Modern", "Java", "In", "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);
    }

    public Stream<String> emptyStream() {
        return Stream.empty();
    }

}

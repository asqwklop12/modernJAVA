package chapter05.make.steams;

import java.util.stream.Stream;

public class CanNull {

    public Stream<String> homeValueStream(String value) {
        String homeValue = System.getProperty("home");
        return homeValue == null ? Stream.empty() : Stream.of(value);
    }

    public Stream<String> homeValeStream() {
        return Stream.ofNullable(System.getProperty("home"));
    }

    public Stream<String> values() {
        return Stream.of("config", "home", "user")
                .flatMap(key -> Stream.ofNullable(System.getProperty(key)));
    }

}

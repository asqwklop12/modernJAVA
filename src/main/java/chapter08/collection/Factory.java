package chapter08.collection;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class Factory {
    public static List<String> unsupported() {
        List<String> friends = Arrays.asList("Raphael", "Olivia");
        friends.set(0, "Richard");
        friends.add("Thibaut");
        return friends;
    }

    public static void main(String[] args) {
        System.out.println(new Factory().hash2());
    }

    public List<String> original() {
        List<String> friends = new ArrayList<>();
        friends.add("Raphael");
        friends.add("Olivia");
        friends.add("Thibaut");
        return friends;
    }

    public List<String> factoryMethod() {
        return Arrays.asList("Raphael", "Olivia", "Thibaut");
    }

    public Set<String> hash1() {
        return new HashSet<>(Arrays.asList("Raphael", "Olivia", "Thibaut"));
    }

    public Set<String> hash2() {
        return Stream.of("Raphael", "Olivia", "Thibaut")
                .collect(toSet());
    }

}

package chapter08.map;

import java.util.Map;

import static java.util.Map.Entry;
import static java.util.Map.entry;

public class Arrays {

    public static void main(String[] args) {
        new Arrays().print();
    }

    public Map<String, String> favoriteMovies() {
        return Map.ofEntries(entry("Raphael", "Star Wars"),
                entry("Cristina", "Matrix"),
                entry("Olivia", "James Bond"));
    }

    public void print() {
        Map<String, String> favoriteMovies = favoriteMovies();
        favoriteMovies
                .entrySet()
                .stream()
                .sorted(Entry.comparingByKey())
                .forEachOrdered(System.out::println);
    }
}

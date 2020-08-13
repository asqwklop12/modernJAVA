package chapter08.map;

import java.util.Map;

import static java.util.Map.entry;

public class GetOrDefault {

    public static void main(String[] args) {
        Map<String, String> favoriteMovies = new GetOrDefault().favoriteMovies();

        System.out.println(favoriteMovies.getOrDefault("Olivia", "Matrix"));
        System.out.println(favoriteMovies.getOrDefault("Thibaut", "Matrix"));
    }

    public Map<String, String> favoriteMovies() {
        return Map.ofEntries(entry("Raphael", "star Wars"),
                entry("Olivia", "James Bond"));
    }
}

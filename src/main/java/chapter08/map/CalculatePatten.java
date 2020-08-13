package chapter08.map;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class CalculatePatten {

    public static void main(String[] args) {
        new CalculatePatten().merge2();
    }

    public void init() throws NoSuchAlgorithmException {
        Map<String, byte[]> dataToHash = new HashMap<>();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
    }

    public Map<String, String> friends() {
        Map<String, String> friends = Map.ofEntries(entry("Raphael", "Star Wars"),
                entry("Cristina", "Matrix"));
        return friends;
    }

    public void merge() {
        Map<String, String> family = Map.ofEntries(
                entry("Teo", "Star Wars"),
                entry("Cristina", "James Bond"));
        Map<String, String> everyone = new HashMap<>(family);
        everyone.putAll(friends());
        System.out.println(everyone);
    }

    public void merge2() {
        Map<String, String> family = Map.ofEntries(
                entry("Teo", "Star Wars"),
                entry("Cristina", "James Bond"));
        Map<String, String> everyone = new HashMap<>(family);
        everyone.forEach((k, v) ->
                everyone.merge(k, v, (movie1, movie2) -> movie1 + " & " + movie2));
        System.out.println(everyone);
    }

    public void count() {
        Map<String, Long> moviesToCount = new HashMap<>();
        String movieName = "JamesBond";
        Long count = moviesToCount.get(movieName);
        if (count == null) {
            moviesToCount.put(movieName, 1L);
        } else {
            moviesToCount.put(movieName, count + 1);
        }
    }

    public void count2() {
        Map<String, Long> moviesToCount = new HashMap<>();
        String movieName = "JamesBond";
        moviesToCount.merge(movieName, 1L, (key, count) -> count + 1L);
    }

}

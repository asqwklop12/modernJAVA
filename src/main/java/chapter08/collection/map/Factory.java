package chapter08.collection.map;

import java.util.Map;

import static java.util.Map.entry;

public class Factory {
    public static void main(String[] args) {
        System.out.println(new Factory().ageOfFriends2());
    }

    public Map<String, Integer> ageOfFriends() {
        return Map.of("Raphael", 30, "Olivia", 25, "Thibaut", 26);
    }

    public Map<String, Integer> ageOfFriends2() {
        return Map.ofEntries(entry("Raphael", 30),
                entry("Olivia", 25),
                entry("Thibaut", 26));
    }
}

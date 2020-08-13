package chapter08.collection.set;

import java.util.Set;

public class Factory {
    public static void main(String[] args) {
        System.out.println(new Factory().friends());
    }

    public Set<String> friends() {
        return Set.of("Raphael", "Olivia", "Olivia"); // 중복
    }
}

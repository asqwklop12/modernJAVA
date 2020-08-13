package chapter08.collection.list;

import java.util.List;

public class Factory {

    public static void main(String[] args) {
        System.out.println(new Factory().add());
    }

    public List<String> friends() {
        return List.of("Raphael", "Olivia", "Thibaut");
    }

    public List<String> add() {
        List<String> friends = friends();
        friends.add("Chin-Chun");
        return friends;
    }

}

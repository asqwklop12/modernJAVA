package chapter08.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Quiz {

    public Map<String, Integer> init() {
        Map<String, Integer> movies = new HashMap<>();
        movies.put("JamesBond", 20);
        movies.put("Matrix", 15);
        movies.put("Harry Potter", 5);
        return movies;
    }

    public void q() {
        Map<String, Integer> movies = init();
        Iterator<Map.Entry<String, Integer>> iterator = movies.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 10) {
                iterator.remove();
            }
        }
    }

    public void a() {
        Map<String, Integer> movies = init();
        movies.entrySet().removeIf(entry -> entry.getValue() < 10);
    }
}

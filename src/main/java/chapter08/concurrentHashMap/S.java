package chapter08.concurrentHashMap;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class S {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Long> map = new ConcurrentHashMap<>();
        long parallelismThreshold = 1;
        Optional<Long> maxValue =
                Optional.ofNullable(map.reduceValues(parallelismThreshold, Long::sum));

        System.out.println(map.mappingCount());
        System.out.println(map.keySet());
        ConcurrentHashMap.KeySetView<Object, Boolean> newC = ConcurrentHashMap.newKeySet();
        System.out.println(newC);
    }


}

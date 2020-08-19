package chapter11.optinal.example;

import java.util.Map;
import java.util.Optional;

public class Null {

    public Object value(Map<String, Object> map) {
        return map.get("key");
    }

    public Optional<Object> valueAToOptional(Map<String, Object> map) {
        return Optional.ofNullable(map.get("key"));
    }
}

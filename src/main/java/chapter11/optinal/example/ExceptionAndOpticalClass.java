package chapter11.optinal.example;

import java.util.Optional;

public class ExceptionAndOpticalClass {
    public static Optional<Integer> stringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}

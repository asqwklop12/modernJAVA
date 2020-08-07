package chapter05.make.steams;

import java.util.Arrays;

public class ArrayEs {

    final int[] numbers = {2, 3, 5, 7, 11, 13};

    public int sum() {
        return Arrays.stream(numbers).sum();
    }
}

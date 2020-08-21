package chapter13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortE {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 6);
        // 디폴트 메서드
        numbers.sort(Comparator.naturalOrder());

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}

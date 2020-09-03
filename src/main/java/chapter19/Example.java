package chapter19;

import chapter03.lamdba.Apple;
import chapter03.meathod.Letter;

import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.comparing;

public class Example {

    // 지역 변수 할당
    static Function<String, String> a = Letter::addHeader;

    public static Function<String, Integer> strToInt() {
        return Integer::parseInt;
    }

    public static Comparator<Apple> c() {
        return comparing(Apple::getWeight);
    }

    public static Function<String, String> addHeader() {
        return Letter::addHeader;
    }

    public static Function<String, String> transformationPipeline() {
        return addHeader()
                .andThen(Letter::checkSpelling)
                .andThen(Letter::addFooter);
    }


    public static void main(String[] args) {
        System.out.println(strToInt().apply("123456789"));
        System.out.println(transformationPipeline().apply("123455"));
    }
}

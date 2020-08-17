package chapter10;

import java.util.Arrays;
import java.util.List;

public class InnerDSL {

    public void dsl() {
        List<String> numbers = Arrays.asList("one", "two", "three");
//        numbers.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        numbers.forEach(System.out::println);
    }
}

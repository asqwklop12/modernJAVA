package chapter09.degin_pattern.chain;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdaClient {
    public static void main(String[] args) {
        UnaryOperator<String> headerProcessing =
                (String text) -> "From Raoul, Mario and Alan: " + text;
        UnaryOperator<String> spellProcessing =
                (text) -> text.replaceAll("labda", "lambda");

        Function<String, String> pipeline =
                headerProcessing.andThen(spellProcessing);
        String result = pipeline.apply("Aren't labdas really sexy?!!!");
        System.out.println(result);
    }
}

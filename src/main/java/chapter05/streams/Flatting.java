package chapter05.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Flatting {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "world");

        // 1단계 map
        List<String[]> strings = words.stream()
                .map(word -> word.split(""))
                .distinct()
                .collect(toList());

        String[] arrayOfWords = {"Goodbye", "world"};
        List<String> streamOfWords = Arrays.asList(arrayOfWords);

        // 2단계 Arrays::stream
        List<Stream<String>> streams2 = streamOfWords.stream()
                .map(word -> word.split(""))
                .map(Arrays::stream)
                .distinct()
                .collect(toList());

        // 3단계 flatMap
        List<String> uniqueCharacters = streamOfWords.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());


    }
}

package chapter08.list_set;

import java.util.List;
import java.util.ListIterator;

import static java.util.stream.Collectors.toList;

public class ReplaceAll {

    public void referenceCodeSet(List<String> referenceCodes) {
        referenceCodes.stream()
                .map(code -> Character.toUpperCase(code.charAt(0))
                        + code.substring(1))
                .collect(toList())
                .forEach(System.out::println);
    }

    public void referenceWrong(List<String> referenceCodes) {
        for (ListIterator<String> iterator = referenceCodes.listIterator(); iterator.hasNext(); ) {
            String code = iterator.next();
            iterator.set(Character.toUpperCase(code.charAt(0)) + code.substring(1));
        }
    }

    // 자바 8
    public void eight(List<String> referenceCodes) {
        referenceCodes.replaceAll(code -> Character.toUpperCase(code.charAt(0)) + code.substring(1));
    }
}

package chapter06;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reducing {

    List<Transaction> transactions(Stream<Transaction> transactionStream) {
        return transactionStream.collect(Collectors.toList());
    }
}

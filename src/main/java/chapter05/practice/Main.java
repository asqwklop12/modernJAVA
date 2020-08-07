package chapter05.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Main {

    public static List<Transaction> haven2011Transaction(List<Transaction> transactions) {
        return transactions.stream()
                .filter(i -> i.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
    }

    public static List<String> distinctCity(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(toList());
    }

    public static List<Trader> walkingInCambridge(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
    }

    public static String allTraderName(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);
    }

    public static boolean isTraderInMilan(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equals("Milan"));
    }

    public static void livingInCambridge(List<Transaction> transactions) {
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
    }

    public static Optional<Integer> maxValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
    }

    public static Optional<Transaction> minValue(List<Transaction> transactions) {
        return transactions.stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
    }

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        System.out.println(haven2011Transaction(transactions));
        System.out.println(distinctCity(transactions));
        System.out.println(walkingInCambridge(transactions));
        System.out.println(allTraderName(transactions));
        System.out.println(isTraderInMilan(transactions));
        livingInCambridge(transactions);
        System.out.println(maxValue(transactions));
        System.out.println(minValue(transactions));
    }
}

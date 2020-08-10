package chapter06;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class TransactionE {
    // 통화별로 트랜잭션 리스트를 그룹화하시오.
    public Map<Currency, List<Transaction>> first(List<Transaction> transactions) {
        Map<Currency, List<Transaction>> transactionByCurrencies = new HashMap<>();

        for (Transaction transaction : transactions) {
            Currency currency = transaction.getCurrency();
            List<Transaction> transactionsForCurrency = transactionByCurrencies.get(currency);

            if (transactionsForCurrency == null) {
                transactionsForCurrency = new ArrayList<>();
                transactionByCurrencies.put(currency, transactionsForCurrency);
            }
            transactionsForCurrency.add(transaction);
        }

        return transactionByCurrencies;
    }

    public Map<Currency, List<Transaction>> second(List<Transaction> transactions) {
        return transactions.stream().collect(groupingBy(Transaction::getCurrency));
    }

}

package chapter08;

import chapter05.practice.Trader;

import java.util.Currency;

public class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;
    private Currency currency;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }

    public String getReferenceCode() {
        return getTrader().getName();
    }

    @Override
    public String toString() {
        return "{" + this.trader + ", " +
                "year: " + this.year + ", " +
                "value: " + this.value + "}";
    }

}

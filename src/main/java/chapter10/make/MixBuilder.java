package chapter10.make;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class MixBuilder {
    public static Order forCustomer(String customer, TradeBuilderWithMix... builders) {
        Order order = new Order();
        order.setCustomer(customer);
        Stream.of(builders).forEach(b -> order.addTrade(b.trade));
        return order;
    }

    public static TradeBuilderWithMix buy(Consumer<TradeBuilderWithMix> consumer) {
        return buildTrade(consumer, Trade.Type.BUY);
    }

    public static TradeBuilderWithMix sell(Consumer<TradeBuilderWithMix> consumer) {
        return buildTrade(consumer, Trade.Type.SELL);
    }

    private static TradeBuilderWithMix buildTrade(Consumer<TradeBuilderWithMix> consumer, Trade.Type type) {
        TradeBuilderWithMix builder = new TradeBuilderWithMix();
        builder.trade.setType(type);
        consumer.accept(builder);
        return builder;
    }
}

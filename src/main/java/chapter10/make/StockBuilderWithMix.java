package chapter10.make;

public class StockBuilderWithMix {
    private final TradeBuilderWithMix builder;
    private final Trade trade;
    private final Stock stock = new Stock();

    public StockBuilderWithMix(TradeBuilderWithMix builder, Trade trade, String symbol) {
        this.builder = builder;
        this.trade = trade;
        stock.setSymbol(symbol);
    }

    public TradeBuilderWithMix on(String market) {
        stock.setMarket(market);
        trade.setStock(stock);
        return builder;
    }
}

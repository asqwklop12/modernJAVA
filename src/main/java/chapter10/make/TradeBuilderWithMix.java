package chapter10.make;

public class TradeBuilderWithMix {

    public final Trade trade = new Trade();

    public TradeBuilderWithMix quantity(int quantity) {
        trade.setQuantity(quantity);
        return this;
    }

    public TradeBuilderWithMix at(double price) {
        trade.setPrice(price);
        return this;
    }

    public StockBuilderWithMix stock(String symbol) {
        return new StockBuilderWithMix(this, trade, symbol);
    }
}

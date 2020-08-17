package chapter10.make;

import chapter10.use.Tax;
import chapter10.use.TaxCalculator;
import chapter10.use.TaxCalculatorWithLambda;

import static chapter10.make.LambdaOrderBuilder.order;
import static chapter10.make.MethodChainingOrderBuilder.forCustomer;
import static chapter10.make.MixBuilder.buy;
import static chapter10.make.MixBuilder.forCustomer;
import static chapter10.make.MixBuilder.sell;
import static chapter10.make.NestedFunctionOrderBuilder.at;
import static chapter10.make.NestedFunctionOrderBuilder.buy;
import static chapter10.make.NestedFunctionOrderBuilder.on;
import static chapter10.make.NestedFunctionOrderBuilder.order;
import static chapter10.make.NestedFunctionOrderBuilder.sell;
import static chapter10.make.NestedFunctionOrderBuilder.stock;

public class Client {
    public static void main(String[] args) {
        Order order;

        order = new Order();

        order.setCustomer("BigBank");

        Trade trade1 = new Trade();
        trade1.setType(Trade.Type.BUY);

        Stock stock1 = new Stock();
        stock1.setSymbol("IBM");
        stock1.setMarket("NYSE");

        trade1.setStock(stock1);
        trade1.setPrice(125.00);
        trade1.setQuantity(80);
        order.addTrade(trade1);

        Trade trade2 = new Trade();
        trade2.setType(Trade.Type.BUY);

        Stock stock2 = new Stock();
        stock2.setSymbol("GOOGLE");
        stock2.setMarket("NASDAQ");

        trade1.setStock(stock2);
        trade1.setPrice(375.00);
        trade1.setQuantity(50);
        order.addTrade(trade2);

        // 10.3.1
        Order order1 = forCustomer("BigBank")
                .buy(80)
                .stock("IBM")
                .on("NYSE")
                .at(125.00)
                .sell(50)
                .stock("GOOGLE")
                .on("NASDAQ")
                .at(375.00)
                .end();

        // 10.3.2
        Order order2 = order("BigBank",
                buy(80,
                        stock("IBM", on("NYSE")), at(125.00)),
                sell(50,
                        stock("GOOGLE", on("NASDAQ")), at(375.00))
        );

        // 10.3.3 람다 표현식
        Order order3 = order(o -> {
            o.forCustomer("BigBank");
            o.buy(t -> {
                t.quantity(80);
                t.price(125.00);
                t.stock(s -> {
                    s.symbol("IBM");
                    s.market("NYSE");
                });
            });

            o.sell(t -> {
                t.quantity(50);
                t.price(375.00);
                t.stock(s -> {
                    s.symbol("GOOGLE");
                    s.market("NASDAQ");
                });
            });
        });

        // 10.3.4
        Order order4 =
                forCustomer("BigBank", buy(t -> t.quantity(80)
                                .stock("IBM")
                                .on("NYSE")
                                .at(125.00)),
                        sell(t -> t.quantity(50)
                                .stock("GOOGLE")
                                .on("NASDAQ")
                                .at(375.00))
                );

        double value = new TaxCalculator().withTaxRegional()
                .withTaxSurCharge()
                .calculate(order3);
        System.out.println(value);

        double value2 = new TaxCalculatorWithLambda()
                .with(Tax::regional)
                .with(Tax::surcharge)
                .calculate(order4);
        System.out.println(value2);

    }
}

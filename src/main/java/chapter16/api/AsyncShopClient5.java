package chapter16.api;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import static java.util.stream.Collectors.toList;

public class AsyncShopClient5 {
    static List<Shop2> shops = Arrays.asList(new Shop2("BestPrice"),
            new Shop2("LetsSaveBig"),
            new Shop2("MyFavoriteShop"),
            new Shop2("BuyItAll"));

    private static final Executor executor = Executors.newFixedThreadPool(Math.min(shops.size(), 100), r -> {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    });

    public static List<String> findPrices(String product) {
        return shops.stream()
                .map(shop2 -> shop2.getPrice(product))
                .map(Quote::parse)
                .map(Discount::applyDisCount)
                .collect(toList());
    }


    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(findPrices("myPhone27S"));
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Done in " + duration + " msecs");
    }
}

package chapter16.api;

import java.util.concurrent.Future;

public class ShopClient2 {
    public static void main(String[] args) {
        Shop2 shop = new Shop2("BestShop");
        long start = System.nanoTime();

        Future<Double> futurePrice = shop.getPriceAsync("my favorite product");

        long invocationTime = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Invocation returned after " + invocationTime
                + " msecs");

        doSomethingElse();

        try {
            Double price = futurePrice.get();
            System.out.printf("Price is %.2f\n", price);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        long retrievalTime = ((System.nanoTime() - start) / 1_000_000);

        System.out.println("Price returned after " + retrievalTime + " msecs");
    }

    private static void doSomethingElse() {
//        System.out.println("Hello");
    }
}

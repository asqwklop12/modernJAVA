package chapter09.degin_pattern.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class LambdaFactory {
    final static Map<String, Supplier<Product>> map = new HashMap<>();

    static {
        map.put("loan", Loan::new);
        map.put("stock", Stock::new);
        map.put("bond", Bond::new);
    }

//    Map<String,TriFunction<Integer,Integer,String, Product>> map2 = new HashMap<>();

    public static Product createProduct(String name) {
        Supplier<Product> p = map.get(name);
        if (p != null) return p.get();
        throw new IllegalArgumentException("No Such product " + name);
    }

}

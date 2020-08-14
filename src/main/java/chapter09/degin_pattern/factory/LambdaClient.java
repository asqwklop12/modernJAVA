package chapter09.degin_pattern.factory;

import java.util.function.Supplier;

public class LambdaClient {

    public static void main(String[] args) {
        Supplier<Product> loanSupplier = Loan::new;
        Product version1 = loanSupplier.get();

        Product version2 = LambdaFactory.createProduct("bond");
    }
}

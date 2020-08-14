package chapter09.degin_pattern.factory;

public class Client {
    public static void main(String[] args) {
        Product p = ProductFactory.createProduct("loan");
    }
}

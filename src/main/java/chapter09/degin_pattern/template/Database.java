package chapter09.degin_pattern.template;

public class Database {
    public static Customer getCustomerWithId(int id) {
        return new Customer(id);
    }
}

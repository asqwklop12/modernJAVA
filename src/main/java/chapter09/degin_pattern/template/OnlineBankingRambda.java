package chapter09.degin_pattern.template;

import chapter03.custom.consumer.Consumer;

public class OnlineBankingRambda {

    public static void main(String[] args) {
        new OnlineBankingRambda().processCustomer(1337, (Customer c) ->
                System.out.println("Hello " + c.getName()));
    }

    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy) {
        Customer c = Database.getCustomerWithId(id);
        makeCustomerHappy.accept(c);
    }
}

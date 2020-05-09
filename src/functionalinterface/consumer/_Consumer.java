package functionalinterface.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal Java Function
        Customer halfdev = new Customer("HALFDEV", "gusgodnd@naver.com");
        greetCustomer(halfdev);
        greetCustomerV2(halfdev, false);
        // Consumer Functional interface
        greetCustomerConsumer.accept(halfdev);
        greetCustomerConsumerV2.accept(halfdev, false);
    }

    // Normal Java Functional
    static void greetCustomer(Customer customer) {
        System.out.println("Hello, " + customer.getName() + ", thanks for registering Email " +
                customer.getEmail());
    }
    static void greetCustomerV2(Customer customer, boolean showEmail) {
        System.out.println("Hello, " + customer.getName() + ", thanks for registering Email " +
                (showEmail ? customer.getEmail() : "*********"));
    }

    // Consumer Functional
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello ~ " + customer.getName() + ", thanks for registering Email " +
                    customer.getEmail());
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = ((customer, showEmail) ->
            System.out.println("Hello ~ " + customer.getName() + ", thanks for registering Email " +
                    (showEmail ? customer.getEmail() : "*********")));


    // for _Consumer static Class
    static class Customer {

        private final String name;
        private final String email;

        public Customer(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
    }

}

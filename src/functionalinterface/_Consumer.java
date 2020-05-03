package functionalinterface;

public class _Consumer {
    public static void main(String[] args) {
        // Normal Java Function
        Customer halfdev = new Customer("HALFDEV", "gusgodnd@naver.com");
        greetCustomer(halfdev);
        // TODO greetCustomerV2
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello, " + customer.getName() + ", thanks for registering Email " +
                customer.getEmail());
    }

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

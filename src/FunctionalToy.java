import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class FunctionalToy {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1L);
        product.setName("Halfdev");
        product.setStockQuantity(2);
        product.setPrice(7000);
        product.addStock(7);

        Stream.of(product).forEach(System.out::println); // Product{id=1, name='Halfdev', stockQuantity=9, price=7000}

        boolean getQuantityEmpty = filter.test(product.getStockQuantity(), 0);
        System.out.println(getQuantityEmpty); // true or false, If stockQuantity > 0 then 'false'
    }

    static BiPredicate<Integer, Integer> filter = (x, y) -> {
        return x.compareTo(y) > 0;
    };

    static class Product {

        private Long id;
        private String name;
        private int stockQuantity;
        private int price;

        public void addStock(int quantity) {
            this.stockQuantity += quantity; // stockQuantity = stockQuantity + quantity
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", stockQuantity=" + stockQuantity +
                    ", price=" + price +
                    '}';
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setStockQuantity(int stockQuantity) {
            this.stockQuantity = stockQuantity;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getStockQuantity() {
            return stockQuantity;
        }

        public int getPrice() {
            return price;
        }
    }
}

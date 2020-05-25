package stream;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        // Before
        int nums [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        System.out.println(sum); // 55

        // Stream
        int reduce = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
//        int reduce = Arrays.stream(nums).reduce(0, Integer::sum);
        System.out.println(reduce); // 55

        // Max and Min
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(max); // 10
        int min = Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b);
        System.out.println(min); // 0

        // Map & Reduce
        List<Invoice> invoices = Arrays.asList(
                new Invoice("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
                new Invoice("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
                new Invoice("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2))
        );

        BigDecimal sumMapReduce = invoices.stream()
                .map(x -> x.getQty().multiply(x.getPrice())) // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);// reduce

        System.out.println(sumMapReduce); // 49.955
        System.out.println(sumMapReduce.setScale(2, RoundingMode.HALF_UP)); // 49.96



    }

    static class Invoice {

        String invoiceNo;
        BigDecimal price;
        BigDecimal qty;

        public void setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public void setQty(BigDecimal qty) {
            this.qty = qty;
        }

        public String getInvoiceNo() {
            return invoiceNo;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public BigDecimal getQty() {
            return qty;
        }

        public Invoice(String invoiceNo, BigDecimal price, BigDecimal qty) {
            this.invoiceNo = invoiceNo;
            this.price = price;
            this.qty = qty;
        }
    }
}

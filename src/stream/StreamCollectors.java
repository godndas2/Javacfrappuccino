package stream;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectors {
    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        // Group by a List and display the total count of it.
        Map<String, Long> collect = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect); // {papaya=1, orange=1, banana=2, apple=3}

        // Add sorting
        Map<String, Long> finalMap = new LinkedHashMap<>();

        // forEachOrdered : 스트림이 순차적인지 병렬인지에 관계없이 소스에서 지정한 순서대로 스트림 요소를 처리
        collect.entrySet().stream()
                .sorted(Map.Entry.<String, Long> comparingByValue()
                .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        System.out.println(finalMap); // {apple=3, banana=2, papaya=1, orange=1}

        // 'group by' a list of user defined Objects.
        //3 apple, 2 banana, others 1
        List<Item> items2 = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orange", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );

        Map<String, Long> counting = items2.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        System.out.println(counting); // {papaya=1, orange=1, banana=2, apple=3, watermelon=1}

        Map<String, Integer> sum = items2.stream().collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
        System.out.println(sum); // {papaya=20, orange=10, banana=30, apple=40, watermelon=10}

        Map<BigDecimal, List<Item>> price = items2.stream().collect(Collectors.groupingBy(Item::getPrice));
        System.out.println(price);

        // group by price, uses 'mapping' to convert List<Item> to Set<String>
        Map<BigDecimal, Set<String>> setMap =
                items2.stream().collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));
        System.out.println(setMap);
        // {
        //	19.99=[
        //			Item{name='banana', qty=20, price=19.99},
        //			Item{name='banana', qty=10, price=19.99}
        //		],
        //	29.99=[
        //			Item{name='orang', qty=10, price=29.99},
        //			Item{name='watermelon', qty=10, price=29.99}
        //		],
        //	9.99=[
        //			Item{name='apple', qty=10, price=9.99},
        //			Item{name='papaya', qty=20, price=9.99},
        //			Item{name='apple', qty=10, price=9.99},
        //			Item{name='apple', qty=20, price=9.99}
        //		]
        // }
    }

    static class Item {
        private String name;
        private int qty;
        private BigDecimal price;

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", qty=" + qty +
                    ", price=" + price +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getQty() {
            return qty;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public Item(String name, int qty, BigDecimal price) {
            this.name = name;
            this.qty = qty;
            this.price = price;
        }
    }
}

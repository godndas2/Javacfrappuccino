package functionalinterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerForEach {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strList = Arrays.asList("a", "ab", "abc");

        Consumer<Integer> consumer = (Integer x) -> System.out.println(x);
        forEach(list, consumer);

        // call this directly
        forEach(list, (Integer x) -> System.out.println(x));

        // String
        forEach(strList, (String x) -> System.out.println(x)); // a ab abc
        forEach(strList, (String x) -> System.out.println(x.length())); // 1 2 3
    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}

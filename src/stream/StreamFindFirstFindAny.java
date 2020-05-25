package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstFindAny {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 2, 1);

        Optional<Integer> first = integers.stream().findFirst();
        if (first.isPresent()) {
            Integer integer = first.get();
            System.out.println(integer); // 1
        } else {
            System.out.println("No Value");
        }

        Optional<Integer> first1 = integers.stream().filter(x -> x > 1).findFirst();
        if (first1.isPresent()) {
            System.out.println(first1.get()); // 2
        } else {
            System.out.println("No Value");
        }

        List<String> strings = Arrays.asList("node", "java", "c", "python");
        Optional<String> first2 = strings.stream()
                .filter(x -> !x.equalsIgnoreCase("node")).findFirst();

        if (first2.isPresent()) {
            System.out.println(first2.get()); // java
        } else {
            System.out.println("No Value");
        }

        // findAny() : Find any element from a Stream of Integers.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> any = list.stream().filter(x -> x > 1).findAny();
        if (any.isPresent()) {
            Integer integer = any.get();
            System.out.println(integer); // 2
        }
    }
}

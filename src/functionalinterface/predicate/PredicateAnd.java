package functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
* @author halfdev
* @since 2020-05-10
* Multiple Filters
*/
public class PredicateAnd {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(integers
                .stream()
                .filter(x -> x > 5 && x < 8)
                .collect(Collectors.toList())
        );

        Predicate<Integer> noGreaterThen8 = x -> x < 8;
        Predicate<Integer> noGreaterThen5 = x -> x > 5;
        List<Integer> collect = integers.stream()
                .filter(noGreaterThen5.and(noGreaterThen8))
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}

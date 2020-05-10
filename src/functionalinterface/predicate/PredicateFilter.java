package functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFilter {
    public static void main(String[] args) {

        Predicate<Integer> noGreaterThen5 = x -> x > 5;

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> collect = list.stream()
                .filter(noGreaterThen5)
//                .filter(x -> x > 5)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}

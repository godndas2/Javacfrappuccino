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

        // predicate.and()
        Predicate<Integer> noGreaterThen8 = x -> x < 8;
        Predicate<Integer> noGreaterThen5 = x -> x > 5;
        List<Integer> collect = integers.stream()
                .filter(noGreaterThen5.and(noGreaterThen8))
                .collect(Collectors.toList());
        System.out.println(collect);

        // predicate.or()
        Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        System.out.println(
            list.stream()
                    .filter(lengthIs3.or(startWithA))
                    .collect(Collectors.toList())
        );

        // predicate.negate()
        Predicate<String> startWithAA = x -> x.startsWith("AA");

        // not start with "AA"
        List<String> list1 = Arrays.asList("A", "AA", "AAA", "B", "BB");

        System.out.println(
            list1.stream()
                    .filter(startWithAA.negate())
                    .collect(Collectors.toList())
        );

        // predicate.test()
        List<String> list2 = Arrays.asList("A", "AA", "AAA", "B", "BB");

        System.out.println(StringProcessor.filter(
                list, x -> x.startsWith("A") // [A,AA,AAA]
        ));

        System.out.println(StringProcessor.filter(
                list2, x -> x.startsWith("A") && x.length() == 3 // [AAA]
        ));

        // predicate chaining
        Predicate<String> startWitha = x -> x.startsWith("a");

        boolean test = startWitha.or(x -> x.startsWith("m")).test("mbc");
        System.out.println(test); // true

//        !(start with "a" and length is 3)
        boolean abcdmbcd = startWitha.and(x -> x.length() == 3).negate().test("abc");
        System.out.println(abcdmbcd);


    }

    static class StringProcessor {
        static List<String> filter(List<String> list, Predicate<String> predicate) {
            return list.stream().filter(predicate::test).collect(Collectors.toList());
        }
    }
}

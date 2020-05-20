package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");

        // Before
        List<String> upperCase = new ArrayList<>();
        for (String s : list) {
            upperCase.add(s.toUpperCase());
        }
        System.out.println(list); // [a, b, c, d]
        System.out.println(upperCase); // [A, B, C, D]

        // stream
        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); // [A, B, C, D]

        // stream other test case
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        List<Integer> collectA = integers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collectA); // [2, 4, 6, 8, 10]

    }
}

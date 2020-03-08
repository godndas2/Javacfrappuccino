package loop.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamC {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cat", "Dog"));
        // map
        System.out.println(list.stream()
                .map(s -> s.toUpperCase())
                .collect(joining(" "))); // APPLE BANANA CAT DOG

        System.out.println(list.stream()
                .map(String::toUpperCase)
                .collect(toList())); // [APPLE, BANANA, CAT, DOG]

        // filter
        System.out.println(list.stream()
                .filter(t -> t.length() > 5)
                .collect(joining(" "))); // BANANA

        System.out.println(list.stream()
                .filter(t -> t.length() > 5)
                .collect(toList())); // [Banana]

        Stream<String> stream =
                list.stream()
                .filter(f -> f.contains("p"));
        System.out.println("f -> f.contains(p) :" + stream.collect(toList()));

        // sorted
        System.out.println(list.stream()
                .sorted()
                .collect(toList())); // [Apple, Banana, Cat, Dog]

        List<Integer> listNums = Arrays.asList(1,2,3,3,4,5);
        System.out.println("joining() : " + "\n" +
            listNums.stream()
                    .filter(i -> i > 2)
                    .map(i -> "String: " + i+"\n")
                    .distinct()
                    .collect(joining(",","",""))
        );

        System.out.println("count() : " +
            listNums.stream()
                    .filter(nums -> nums > 2)
                    .distinct() // 중복 제거
                    .count() // count() : 중복 숫자까지 count
        );
    }
}

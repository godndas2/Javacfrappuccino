package loop.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamC {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Cat","Dog"));
        // map
        System.out.println(list.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(" "))); // APPLE BANANA CAT DOG

        System.out.println(list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList())); // [APPLE, BANANA, CAT, DOG]

        // filter
        System.out.println(list.stream()
                .filter(t -> t.length() > 5)
                .collect(Collectors.joining(" "))); // BANANA

        System.out.println(list.stream()
                .filter(t -> t.length() > 5)
                .collect(Collectors.toList())); // [Banana]

        // sorted
        System.out.println(list.stream()
                .sorted()
                .collect(Collectors.toList())); // [Apple, Banana, Cat, Dog]
    }
}

package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamConvertArray {
    public static void main(String[] args) {
        // Stream -> String[]
        String lines = "I Love Java 8 Stream!";

        // split by space, uppercase, and convert to Array
        String[] toArray = Arrays.stream(lines.split("\\s+"))
                .map(String::toUpperCase)
                .toArray(String[]::new);

        for (String s : toArray) {
            System.out.println(s); // I LOVE JAVA 8 STREAM!
        }

        // IntStream -> Integer[] or int[]
        // Stream to Integer[]
        int[] num = {1, 2, 3, 4, 5};

        Integer[] integers = Arrays.stream(num)
                .map(x -> x * 2)
                .boxed()
                .toArray(Integer[]::new);

        System.out.println(Arrays.asList(integers)); // [2, 4, 6, 8, 10]

        // Stream to int[]
        // IntStream -> int[]
        int[] ints = IntStream.rangeClosed(1, 5).toArray();
        System.out.println(Arrays.toString(ints)); // [1, 2, 3, 4, 5]

        // Stream<Integer> -> int[]
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        int[] array = integerStream.mapToInt(x -> x).toArray();
        System.out.println(Arrays.toString(array)); // [1, 2, 3, 4, 5]



    }
}

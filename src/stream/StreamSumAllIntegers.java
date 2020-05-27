package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSumAllIntegers {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total : " + sum); // 55

        Stream<Integer> integerStream = Stream.iterate(1, n -> n + 1).limit(10);
        IntStream intStream = integerStream.mapToInt(x -> x);
        int sum1 = intStream.sum();
        System.out.println("Total : " + sum1); // 55
    }
}

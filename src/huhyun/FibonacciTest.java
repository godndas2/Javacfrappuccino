package huhyun;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciTest {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .forEach(System.out::println);

        // sum all fibonacci nums
        System.out.println("Total : " +
                Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .mapToInt(Integer::intValue)
                .sum()
        );

        // Join with commas
        System.out.println("with commas : " +
                Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .map(String::valueOf)
                .collect(Collectors.joining(", "))
        );

        // create method St
        List<Integer> fibonacci = getFibonacci(10);
        fibonacci.forEach(System.out::println);

    }

    public static List<Integer> getFibonacci(int num) {
        return Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(n -> n[0])
                .collect(Collectors.toList());
    }
}

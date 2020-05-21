package stream;

import java.util.stream.IntStream;

public class StreamParallelTest {
    public static void main(String[] args) {
        System.out.println("NORMAL Ver");

        IntStream range = IntStream.rangeClosed(1,10);
        range.forEach(System.out::println); // 1,2,3,4,5,6,7,8,9,10

        System.out.println("PARALLEL Ver");

        IntStream range2 = IntStream.rangeClosed(1,10);
        range2.parallel().forEach(System.out::println); // 1 ~ 10 random nums

        // check parallel
        System.out.println(range.isParallel()); // false
        System.out.println(range2.isParallel());

        // current thread
        // stream has already been operated upon or closed, So we need new create Stream
//        @See https://hamait.tistory.com/612
        IntStream newRange = IntStream.rangeClosed(1,10);
        newRange.forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
        });

        IntStream newParalRange = IntStream.rangeClosed(1,10);
        newParalRange.parallel().forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
        });

    }
}

package loop.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamB {
    public static void main(String[] args) {
        // V1
        List<String> names = Arrays.asList("hyun", "gazero", "java", "spring");
        long cnt = 0;
        for (String name : names) {
            if (name.contains("o")) {
                cnt++;
            }
        }
        System.out.println("Cnt : " + cnt); // 1

        // Make Stream
        names.stream(); // Collection of stream
        Double[] dArrays = {3.1, 2.2, 3.3};
        Arrays.stream(dArrays); // Array of Stream

        Stream<Integer> str = Stream.of(1, 2); // Stream 직접 생성

        // V2, Filter
        Stream<String> sreamFilter = names.stream()
                .filter(n -> n.contains("o")); // 2
    }

}

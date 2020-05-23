package stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNull {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("java", "python", "node", null, "js", null);
        List<String> collect = stringStream.collect(Collectors.toList());
        collect.forEach(System.out::println); // java python node null js null

        // null check
        Stream<String> stringStream2 = Stream.of("java", "python", "node", null, "js", null);
        List<String> collect1 = stringStream2.filter(x -> x != null).collect(Collectors.toList());
//        List<String> collect1 = stringStream2.filter(Objects::nonNull).collect(Collectors.toList());
        collect1.forEach(System.out::println); // java python node js
    }
}

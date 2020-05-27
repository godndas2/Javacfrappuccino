package stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
* @author halfdev
* @since 2020-05-27
* Stream cannot be reused, once it is consumed or used, the stream will be closed.
*/
public class StreamAlreadyUponOrClosed {
    public static void main(String[] args) {
        // Solution
        String[] array = {"a", "b", "c", "d", "e"};

        Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);
        // get new stream
        streamSupplier.get().forEach(System.out::println); // a,b,c,d,e

        // get another new stream
        long count = streamSupplier.get().filter("b"::equals).count();
        System.out.println(count); // 1
    }
}

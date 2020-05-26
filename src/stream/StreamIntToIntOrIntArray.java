package stream;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
* @author halfdev
* @since 2020-05-27
* get a primitive int from an IntStream
*/
public class StreamIntToIntOrIntArray {
    public static void main(String[] args) {
        // IntStream -> int
        int[] num = {1,2,3,4,5};

        //1. int[] -> IntStream
        IntStream stream = Arrays.stream(num);

        // 2. OptionalInt
        OptionalInt first = stream.findFirst();

        // 3. getAsInt()
        int asInt = first.getAsInt();

        System.out.println(asInt); // 1

        // simple solution
        System.out.println(Arrays.stream(num).findFirst().getAsInt()); // 1

        //
        IntStream stream2 = Arrays.stream(num);
        OptionalInt optionalInt = stream2.filter(x -> x % 2 == 0).findAny();
        int asInt1 = optionalInt.getAsInt();

        System.out.println(asInt1); // 2 or 4 but, almost 2


    }
}

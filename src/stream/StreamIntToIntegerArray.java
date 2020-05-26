package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
* @author halfdev
* @since 2020-05-27
* The key is boxed() the IntStream into a Stream<Integer>, then only convert to an Array.
*/
public class StreamIntToIntegerArray {
    public static void main(String[] args) {
        //int[] -> IntStream -> Stream<Integer> -> Integer[]
        int[] num = {3,4,5};

        //1. int[] -> IntStream
        IntStream intStream = Arrays.stream(num);

        //2. IntStream -> Stream<Integer>
        Stream<Integer> boxed = intStream.boxed();

        //3. Stream<Integer> -> Integer[]
        Integer[] integers = boxed.toArray(Integer[]::new);

        System.out.println(Arrays.toString(integers)); // [3,4,5]

        // simple solution
        Integer[] simple = Arrays.stream(num).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(simple)); // [3,4,5]

    }
}

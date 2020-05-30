package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
* @author halfdev
* @since 2020-05-30
* Check if Array contains a certain value
*/
public class ArrayContainsValue {
    public static void main(String[] args) {
        String[] alphabet = new String[]{"A", "B", "C"};

        List<String> listA = Arrays.asList(alphabet);

        // before
        if (listA.contains("A")) {
            System.out.println("Hello, A");
        }

        // stream
        // anyMatch() : 최소한 한 개의 요소가 주어진 조건에 만족하는지
        boolean anyMatch = Arrays.stream(alphabet).anyMatch("A"::equals);
        if (anyMatch) {
            System.out.println("Hello, A");
        }

        // multiple values
        String[] alphabet2 = new String[]{"A", "C"};

        List<String> listB = Arrays.asList(alphabet2);

        if (listB.contains("A") || listB.contains("B")) {
            System.out.println("Hello, A or B");
        }

        if (listB.containsAll(Arrays.asList("A","B"))) {
            System.out.println("Hello, A and B");
        }

        if (listB.containsAll(Arrays.asList("A","C"))) {
            System.out.println("Hello, A and C");
        }

        // Primitive Arrays
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // before
        if (contains(number, 2)) {
            System.out.println("Hello, 2");
        }

        // stream
        boolean match = IntStream.of(number).anyMatch(x -> x == 4);

        if (match) {
            System.out.println("Hello, 4");
        } else {
            System.out.println("FAILED");
        }

    }

    public static boolean contains(final int[] array, final int v) {
        boolean result = false;

        for (int i : array) {
            if (i == v) {
                result = true;
                break;
            }
        }

        return result;
    }
}

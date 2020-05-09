package functionalinterface.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
* @author halfdev
* @since 2020-05-09
*   T – Type of the first argument to the function.
 *  U – Type of the second argument to the function.
 *  R – Type of the result of the function.
*/
public class BiFunctionTUR {
    public static void main(String[] args) {

        // takes two Integers and return an Integer
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        Integer result = func.apply(2,3);

        System.out.println(result); // 5

        // take two Integers and return an Double
        BiFunction<Integer, Integer, Double> func2 = (x1, x2) -> Math.pow(x1, x2);
        Double result2 = func2.apply(2,4);

        System.out.println(result2); // 16.0

        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);
        List<Integer> result3 = func3.apply(2, 3);

        System.out.println(result3);

        // BiFunctionTUR + Function TR
        String result4 = powToString(2,4, (a1, a2) -> Math.pow(a1, a2), (r) -> "RESULT: " + r); // String.valueOf ..?

        System.out.println(result4);
    }

        public static <R> R powToString(Integer a1, Integer a2,
                                        BiFunction<Integer, Integer, Double> func,
                                        Function<Double, R> func2) {

            return func.andThen(func2).apply(a1,a2);
        }
}

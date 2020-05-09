package functionalinterface.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
* @author halfdev
* @since 2020-05-05
* andThen() <-> compose()
 * andThen: 현재 메소드를 실행 후 매개변수로 받은 람다를 실행한다.
*/
public class _Function {
    public static void main(String[] args) {
        // Function takes 1 argument and produces 1 result
        int increment = incrementByOne(1);
        System.out.println("increment: "+ increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println("increment2: " + increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println("multiply: " +  multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println("addBy1AndThenMultiplyBy10: " + addBy1AndThenMultiplyBy10.apply(4));

        // BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }

    static int incrementByOne(int num) {
        return num + 1;
    }

    static Function<Integer, Integer> incrementByOneFunction =
            num -> num + 1;

    static Function<Integer, Integer> multiplyBy10Function =
            num -> num + 1;

    static int incrementByOneAndMultiply(int num, int numToMultiplyBy) {
        return (num + 1) * numToMultiplyBy;
    }
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    (numberToIncrementByOne + 1) * numberToMultiplyBy;
}

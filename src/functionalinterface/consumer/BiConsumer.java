package functionalinterface.consumer;

/**
* @author halfdev
* @since 2020-05-14
*  it takes two arguments and returns nothing.
*/
public class BiConsumer {
    public static void main(String[] args) {

        java.util.function.BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1,2);
    }
}

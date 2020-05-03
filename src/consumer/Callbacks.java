package consumer;

/**
* @author halfdev
* @since 2020-05-04
* Consumer: Parameter O, return X
 * accept() : Parameter 를 받아 소비하는 역할
 * run() :
 * */
import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        testA("HALF", null, value -> {
            System.out.println("NO LASTNAME PROVIDED FOR: " + value);
        });

        testB("HALF", "DEV", () -> System.out.println("NO LASTNAME PROVIDED"));
    }

    static void testA(String firstName, String lastName, Consumer<String> callback) {
        System.out.println("firstName: " + firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void testB(String firstName, String lastName, Runnable callback) {
        System.out.println("firstName: " + firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}

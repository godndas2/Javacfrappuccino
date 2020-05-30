package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable("able NULL")
                .ifPresent(test -> System.out.println("PASS The Test " + test));
    }
}

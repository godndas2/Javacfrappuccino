package optional;

import java.util.Optional;

public class IfPresentOrGetAlternative {
    public static void main(String[] args) {

        // Checking Value Presence: isPresent() and isEmpty()
        // This method returns true if the wrapped value is not null.
        givenOptional_whenIsPresentWorks_thenCorrect();

    }

    public static void givenOptional_whenIsPresentWorks_thenCorrect() {
        Optional<String> opt = Optional.of("halfdev");
        System.out.println(opt.isPresent()); // true
        opt = Optional.ofNullable(null);
        System.out.println(opt); // Optional.empty :  Optional 내부적으로 미리 생성해놓은 Singleton Instance
    }
}

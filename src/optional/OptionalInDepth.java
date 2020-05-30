package optional;

import java.util.Optional;

/**
* @author halfdev
* @since 2020-05-30
*  Null checks are not required.
*  No more NullPointerException at run-time.
*  We can develop clean and neat APIs.
*  No more Boiler plate code
*/
public class OptionalInDepth {
    public static void main(String[] args) {
        // Optional.ofNullable() method returns a Non-empty Optional if a value present in the given object. Otherwise returns empty Optional
        // Optional.empty() method is useful to create an empty Optional object.

        Optional<String> gender = Optional.of("MALE");
        String ans = "YES";
        String ans2 = null;

        System.out.println("Non-Empty-Optional : " + gender); // Non-Empty-Optional : Optional[MALE]
        System.out.println("Non-Empty-Optional : Gender Value : " + gender.get()); // Non-Empty-Optional : Gender Value : MALE
        System.out.println("Empty-Optional : " + Optional.empty()); // Empty-Optional : Optional.empty

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(ans)); // ofNullable on Non-Empty Optional: Optional[YES]
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(ans2)); // ofNullable on Empty Optional: Optional.empty

        // NPE
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(ans2));

        // TODO Optional.map and flatMap
    }
}

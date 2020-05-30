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
        Optional<String> emptyGender = Optional.empty();

        String ans = "YES";
        String ans2 = null;

        System.out.println("Non-Empty-Optional : " + gender); // Non-Empty-Optional : Optional[MALE]
        System.out.println("Non-Empty-Optional : Gender Value : " + gender.get()); // Non-Empty-Optional : Gender Value : MALE
        System.out.println("Empty-Optional : " + Optional.empty()); // Empty-Optional : Optional.empty

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(ans)); // ofNullable on Non-Empty Optional: Optional[YES]
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(ans2)); // ofNullable on Empty Optional: Optional.empty

        // NPE
//        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(ans2));

        // Optional.map and flatMap
        System.out.println("Non-Empty Optional:: " + gender.map(String::toUpperCase));
        System.out.println("Empty Optional:: " + emptyGender.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOptionalGender = Optional.of(Optional.of("MALE"));
        System.out.println("Optional value:: " + nonEmptyOptionalGender);
        System.out.println("Optional map:: " + nonEmptyOptionalGender.map(x -> x.map(String::toUpperCase)));
        System.out.println("Optional flatMap:: " + nonEmptyOptionalGender.flatMap(x-> x.map(String::toUpperCase)));

        // Optional.filter
        System.out.println(gender.filter(f -> f.equals("thisisempty"))); // Optional.empty
        System.out.println(gender.filter(f -> f.equalsIgnoreCase("MALE"))); // Optional[MALE]
        System.out.println(emptyGender.filter(f -> f.equalsIgnoreCase("MALE"))); // Optional.empty

        // Optional isPresent and ifPresent
        /* Optional.isPresent() returns true if the given Optional object is non-empty. Otherwise it returns false.
          Optional.ifPresent() performs given action if the given Optional object is non-empty. Otherwise it returns false.
        * */
        if (gender.isPresent()) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }

        gender.ifPresent(i -> System.out.println("In gender Option, value available"));
        emptyGender.ifPresent(i -> System.out.println("emptyGender Option"));

        // Optional orElse : It returns the value if present in Optional Container. Otherwise returns given default value.
        System.out.println(gender.orElse("<N/A>")); // MALE
        System.out.println(emptyGender.orElse("<N/A>")); // <N/A>

        System.out.println(gender.orElseGet(() -> "<N/A>")); // MALE
        System.out.println(emptyGender.orElseGet(() -> "<N/A>")); // <N/A>



    }
}

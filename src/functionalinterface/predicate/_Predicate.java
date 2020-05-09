package functionalinterface.predicate;

import java.util.function.Predicate;

/**
* @author halfdev
* @since 2020-05-05
* boolean 값을 return
*/
public class _Predicate {
    public static void main(String[] args) {
        System.out.println("===== Without Predicate =====");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09009877300"));

        System.out.println("===== With predicate =====");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));

        System.out.println("Is phoneNumber Valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("09009877300")
        ); // false

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("07000000000")
        ); // true
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}

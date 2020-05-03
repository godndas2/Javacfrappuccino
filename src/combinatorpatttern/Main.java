package combinatorpatttern;

import combinatorpatttern.CustomerRegistrationValidator.ValidationResult;

import java.time.LocalDate;

import static combinatorpatttern.CustomerRegistrationValidator.*;
import static combinatorpatttern.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "HALFDEV",
                "gusgodnd@naver.com",
                "+0457542451",
                LocalDate.of(1995,5,3)
        );

                // Combinator Pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(" ==== RESULT ==== ");

        if (result != SUCCESS) {
            throw new IllegalStateException(result.name());
        } else {
            System.out.println(result.name());
            System.out.println(customer.getName());
        }
    }
}

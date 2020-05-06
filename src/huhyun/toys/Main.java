package huhyun.toys;

import huhyun.toys.Toy.Lego;

import java.time.LocalDate;

import static huhyun.toys.ToyRegistrationValidator.isAgeValid;
import static huhyun.toys.ToyRegistrationValidator.isManufacturingValidPredicate;
import static huhyun.toys.ValidResultToy.SUCCESS;

public class Main {
    public static void main(String[] args) {
        Toy toy = new Toy(1L, "yellow", 10.5,
                new Lego("KING LEGO",
                        LocalDate.of(2020,5,6),
                        LocalDate.of(1993,11,23)));

        Lego lego = new Lego("KING LEGO",
                LocalDate.of(2020,5,6),
                LocalDate.of(1993,11,23));

        ValidResultToy resultToy = isAgeValid()
                .apply(lego);

        System.out.println("<<<< RESULT >>>>");

        if (resultToy != SUCCESS) {
            throw new IllegalStateException(resultToy.name() + "NOT VALID");
        } else {
            System.out.println(resultToy.name());
            System.out.println(lego.getName());
        }

        System.out.println("<<< PREDICATE >>>");
        System.out.println(isManufacturingValidPredicate.test(lego.getManufacturingYear())); // true

    }
}

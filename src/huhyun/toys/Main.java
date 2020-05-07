package huhyun.toys;

import huhyun.toys.Toy.Lego;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static huhyun.toys.ToyRegistrationValidator.*;
import static huhyun.toys.ValidResultToy.SUCCESS;

public class Main {
    public static void main(String[] args) {
        Toy toy = new Toy(1L, "yellow", 10.5);

        Lego lego = new Lego("KING LEGO",
                LocalDate.of(2020,5,6),
                LocalDate.of(1993,11,23));

        ValidResultToy resultToy =
                isAgeValid()
                .apply(lego);

        System.out.println("<<<< RESULT >>>>");

            if (resultToy != SUCCESS)
                throw new IllegalStateException(lego.getName() + " IS " + resultToy.name());
            else {
                System.out.println(lego.getName() + " IS " + resultToy.name());
            }

        System.out.println("<<< PREDICATE RESULT >>>");
        System.out.println(isManufacturingValidPredicate.test(lego.getManufacturingYear())); // true

        System.out.println("<<< SUPPLIER >>>");
        List<String> list = getColors.get();
        System.out.println(
        list.stream()
                .map(String::toLowerCase)
//                .forEach(System.out::println)
                .collect(Collectors.joining(" "))
        );
    }
}

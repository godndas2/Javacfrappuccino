package huhyun.toys;

import huhyun.toys.Toy.Lego;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import java.util.function.Predicate;

import static huhyun.toys.ValidResultToy.AGE_NOT_VALIID;
import static huhyun.toys.ValidResultToy.SUCCESS;

public interface ToyRegistrationValidator extends Function<Lego, ValidResultToy> {

    static ToyRegistrationValidator isAgeValid() {
        return toy ->
                Period.between(toy.getAge(), LocalDate.now()).getYears() > 10 ? SUCCESS : AGE_NOT_VALIID;
    }

    static Predicate<LocalDate> isManufacturingValidPredicate = legoOfManufacturingYears ->
            legoOfManufacturingYears.getYear() >= 2020;

}

enum ValidResultToy {
    SUCCESS,
    AGE_NOT_VALIID,
    MANUFACTURING_YEAR_NOT_VALID
}

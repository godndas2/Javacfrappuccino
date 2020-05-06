package huhyun.toys;

import java.time.LocalDate;
import java.time.Period;

public class ToyService {
    private boolean isAgeValid(LocalDate age) {
        return Period.between(age, LocalDate.now()).getYears() > 10;
    }

}

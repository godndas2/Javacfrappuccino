package date.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeEx01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, 5, 29);
        LocalTime time = LocalTime.of(12, 59, 01);

        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println(dt);
    }

}

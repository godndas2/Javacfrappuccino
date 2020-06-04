package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDatesInJava {
    public static void main(String[] args) throws ParseException {
        /*
        *   Date.compareTo()
            A classic method to compare two java.util.Date in Java.

            Return value is 0 if both dates are equal.
            Return value is greater than 0 , if Date is after the date argument.
            Return value is less than 0, if Date is before the date argument.
        * */
        SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd");
        Date date = format.parse("2020-12-31");
        Date date2 = format.parse("2021-01-31");

        System.out.println("Date : " + format.format(date));
        System.out.println("Date2 : " + format.format(date2));

        if (date.compareTo(date2) > 0) {
            System.out.println("Date is after Date2");
        } else if (date.compareTo(date2) < 0) {
            System.out.println("Date is Before Date2"); // Here..!
        } else if (date.compareTo(date2) == 0) {
            System.out.println("Date is equal to Date2");
        } else {
            System.out.println("How to get here?");
        }

        // A more user friendly method to compare

    }
}

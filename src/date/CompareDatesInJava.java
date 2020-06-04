package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

        System.out.println();
        // A more user friendly method to compare
        if (date.after(date2)) {
            System.out.println("Date is after Date2");
        }

        if (date.before(date2)) {
            System.out.println("Date is before Date2");
        }

        if (date.equals(date2)) {
            System.out.println("Date is equal Date2");
        }

        System.out.println();
        // java8
        // isBefore(), isAfter(), isEqual() and compareTo()
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.of(2020, 12, 31);
        LocalDate localDate2 = LocalDate.of(2021,1, 31);

        System.out.println("localDate : " + sdf.format(localDate));
        System.out.println("localDate2 : " + sdf.format(localDate2));

        System.out.println("Is...");

        if (localDate.isAfter(localDate2)) {
            System.out.println("LocalDate is after LocalDate2");
        }

        if (localDate.isBefore(localDate2)) {
            System.out.println("LocalDate is before LocalDate2");
        }

        if (localDate.isEqual(localDate2)) {
            System.out.println("LocalDate is equal LocalDate2");
        }

        System.out.println("CompareTo..");

        if (localDate.compareTo(localDate2) > 0) {
            System.out.println("LocalDate is after LocalDate2");
        } else if (localDate.compareTo(localDate2) < 0) {
            System.out.println("LocalDate is Before LocalDate2");
        } else if (localDate.compareTo(localDate2) == 0) {
            System.out.println("LocalDate is equal to LocalDate2");
        } else {
            System.out.println("How to get here?");
        }

    }
}

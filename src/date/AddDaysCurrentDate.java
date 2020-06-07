package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddDaysCurrentDate {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args) {
        // Example to add 1 year, 1 month, 1 day, 1 hour, 1 minute and 1 second to the current date
        Date currentDate = new Date();
        System.out.println(DATE_FORMAT.format(currentDate)); // 2020/06/08 00:10:23

        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);

        // manipulate date
        c.add(Calendar.YEAR, 1);
        c.add(Calendar.MONTH, 1);
        c.add(Calendar.DATE, 1); //c.add(Calendar.DAY_OF_MONTH, 1);
        c.add(Calendar.HOUR, 1);
        c.add(Calendar.MINUTE, 1);
        c.add(Calendar.SECOND, 1);

        // convert calendar to date
        Date currentDatePlus = c.getTime();

        System.out.println(DATE_FORMAT.format(currentDatePlus)); // 2021/07/09 01:11:24
    }
}

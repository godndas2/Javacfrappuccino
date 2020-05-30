package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class StringToDate {
    private static SimpleDateFormat format = new SimpleDateFormat();

    public static void main(String[] args) {

        try {
            format.applyPattern("yyyy-MM-dd"); // 1
            String dateInStr = "2020-05-30";
            Date date = format.parse(dateInStr);
            System.out.println(date);
            System.out.println(format.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            format.applyPattern("yyyy/MM/dd"); // 2
            String dateInStr = "2020/05/30";
            Date date = format.parse(dateInStr);
            System.out.println(date);
            System.out.println(format.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            format.applyPattern("yyyy-MM-dd'T'HH:mm:ssZ"); // 3
            String dateInStr = "2020-05-30T15:23:01Z";
            Date date = format.parse(dateInStr.replaceAll("Z$", "+0000"));
            System.out.println(date);

            System.out.println("time zone : " + TimeZone.getDefault().getID()); // time zone : Asia/Seoul
            System.out.println(format.format(date)); // 2020-05-31T00:23:01+0900
        } catch (ParseException e) {
            e.printStackTrace();
        }






    }
}

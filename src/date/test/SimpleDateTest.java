package date.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTest {

    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat a1, a2, a3, a4;
        SimpleDateFormat a5, a6, a7, a8, a9;

        a1 = new SimpleDateFormat("yyyy-MM-dd");
        a2 = new SimpleDateFormat("yyyy�� MMM dd�� E����");
        a3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS a");
        a4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        a5 = new SimpleDateFormat("������ �� ���� D�� ° ���Դϴ�.");
        a6 = new SimpleDateFormat("������ �� ���� d�� ° ���Դϴ�.");
        a7 = new SimpleDateFormat("������ �� ���� w�� ° ���Դϴ�.");
        a8 = new SimpleDateFormat("������ �� ���� W�� ° ���Դϴ�.");
        a9 = new SimpleDateFormat("������ �� ���� F�� ° E�����Դϴ�.");

        System.out.println(a1.format(today));
        System.out.println(a2.format(today));
        System.out.println(a3.format(today));
        System.out.println(a4.format(today));
        System.out.println(a5.format(today));
        System.out.println(a6.format(today));
        System.out.println(a7.format(today));
        System.out.println(a8.format(today));
        System.out.println(a9.format(today));

    }

}

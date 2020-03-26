package date.test;

import java.util.Calendar;

public class BirthToday {

    public static void main(String[] args) {
        Calendar born1 = Calendar.getInstance(); // ����
        Calendar born2 = Calendar.getInstance(); // ���� ��¥

        long days = 0; // ��ƿ� ��¥

        born1.set(1993, 11, 23);

        days = (born2.getTimeInMillis() - born1.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        System.out.println("��ƿ� �� : " + days + "��");
    }

}

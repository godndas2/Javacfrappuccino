package date.test;

import java.util.Calendar;

public class TestApp {

    public static void main(String[] args) {
        // ������ 1���� �����ϱ� ������, DAY_OF_WEEK[0]�� ����д�.
        final String[] DAY_OF_WEEK = {"", "��", "ȭ", "��", "��", "��", "��"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        //month�� ��� 0 ���� �����ϱ� ������ 8���� ���, 7�� �����ؾ��Ѵ�.
        //date1.set(2019, Calendar.April, 16);
        date1.set(2019, 04, 16);
        System.out.println("date1��  " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "�����̰�,");
        System.out.println("����(date2)�� " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "�����Դϴ�.");

        // �� ��¥���� ���� ���ϱ� * getTimeMillis() : 1000���� 1�� ������ ��ȯ
        long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
        System.out.println("�� ��(date1)���� ����(date2)���� " + diff + "�ʰ� �������ϴ�.");
        System.out.println("��(day)�� ����ϸ� " + diff / (24 * 60 * 60) + "���Դϴ�.");
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " + date.get(Calendar.DATE) + "�� ";
    }

}

package date.test;

import java.util.Calendar;

public class CalendarEx02 {

    public static void main(String[] args) {
        // ��� �� ���� ��¥ �������� �� ���� ������?

        Calendar date = Calendar.getInstance();
        date.set(2019, 4, 28); // 2019�� 5�� 27��

        System.out.println(toString(date));
        System.out.println("= 1�� �� =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= 6�� �� =");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        System.out.println("= 31�� �� =");
        date.add(Calendar.MONTH, 1);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " + date.get(Calendar.DATE) + "��";
    }

}

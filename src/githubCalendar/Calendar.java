package githubCalendar;

import java.util.Scanner;

public class Calendar {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getmaxDaysMonth(int month) {
        return MAX_DAYS[month - 1];
    }

    public void sampleCalendar() {
        System.out.println("Calendar");
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        System.out.println("1  2  3  4  5  6  7");
        System.out.println("8  9  10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }

    public static void main(String[] args) {

        // 숫자를 입력받아 해당하는 달의 최대일수출력
        Scanner sc = new Scanner(System.in);
        Calendar cal = new Calendar();
        System.out.println("달을 입력하세요");
        int month = sc.nextInt();

        int[] maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getmaxDaysMonth(month));
        cal.sampleCalendar();
        sc.close();

        //Switch문 방식
        // int days = 0;
        // int month;
        // month = sc.nextInt();
        // switch (month) {
        // case 4:
        // case 6:
        // case 9:
        // case 11:
        // days = 30;
        // break;
        // case 2:
        // days = 28;
        // break;
        // default:
        // days = 31;
        // break;
        // }
        // System.out.println("입력하신 달의 최대일수는 " + days +" 일 입니다.");
    }
}//switch, method, array 방식 모두 사용

package date.test;

import java.util.Calendar;

public class CalendarEx02 {

	public static void main(String[] args) {
		// 모두 다 오늘 날짜 기준으로 할 수는 없을까?
		
		Calendar date = Calendar.getInstance();
		date.set(2019, 4, 28); // 2019년 5월 27일
		
		System.out.println(toString(date));
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));

		System.out.println("= 31일 후 ="); 
		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) +"년 " + (date.get(Calendar.MONTH) + 1) +"월 " + date.get(Calendar.DATE) + "일";
	}

}

package date.test;

import java.util.Calendar;

public class BirthToday {

	public static void main(String[] args) {
		Calendar born1 = Calendar.getInstance(); // 생일
		Calendar born2 = Calendar.getInstance(); // 오늘 날짜
		
		long days = 0; // 살아온 날짜
		
		born1.set(1993, 11, 23);
		
		days = (born2.getTimeInMillis() - born1.getTimeInMillis()) / (24*60*60*1000);
		System.out.println("살아온 날 : " + days +"일");
	}

}

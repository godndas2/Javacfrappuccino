package date.test;

import java.util.Calendar;

public class TestApp {

	public static void main(String[] args) {
		// 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워둔다.
		final String[] DAY_OF_WEEK = {"","일","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//month의 경우 0 부터 시작하기 때문에 8월인 경우, 7로 지정해야한다.
		//date1.set(2019, Calendar.April, 16);
		date1.set(2019, 04, 16);
		System.out.println("date1은  " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일이고,");
		System.out.println("오늘(date2)은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");
		
		// 두 날짜간의 차이 구하기 * getTimeMillis() : 1000분의 1초 단위로 변환
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("그 날(date1)부터 지금(date2)까지 " + diff + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + diff / (24*60*60) +"일입니다.");
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1)+"월 " + date.get(Calendar.DATE) + "일 ";
	}

}

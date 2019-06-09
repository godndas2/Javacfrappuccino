package date.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTest {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat a1,a2,a3,a4;
		SimpleDateFormat a5,a6,a7,a8,a9;
		
		a1 = new SimpleDateFormat("yyyy-MM-dd");
		a2 = new SimpleDateFormat("yyyy년 MMM dd일 E요일");
		a3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS a");
		a4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

		a5 = new SimpleDateFormat("오늘은 올 해의 D번 째 날입니다.");
		a6 = new SimpleDateFormat("오늘은 이 달의 d번 째 날입니다.");
		a7 = new SimpleDateFormat("오늘은 올 해의 w번 째 주입니다.");
		a8 = new SimpleDateFormat("오늘은 이 달의 W번 째 주입니다.");
		a9 = new SimpleDateFormat("오늘은 이 달의 F번 째 E요일입니다.");
		
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

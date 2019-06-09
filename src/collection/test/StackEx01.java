package collection.test;

import java.util.Stack;

public class StackEx01 {

	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		goURL("1.Naver");
		goURL("2.Daum");
		goURL("3.Nate");
		goURL("4.Google");
		
		printStatus();
		
		goBack();
		System.out.println("= 뒤로가기 =");
		printStatus();
		
		goBack();
		System.out.println("= [뒤로] 클릭 ");
		printStatus();
		
		goForward();
		System.out.println("= [앞으로] 클릭 ");
		printStatus();
		
		goURL("halfDev.com");
		System.out.println("= new url = ");
		printStatus();
	}
	
	public static void printStatus() {
		System.out.println("back: " + back);
		System.out.println("forward: " + forward);
		System.out.println("현재화면은 '" + back.peek()+"' 입니다.");
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if (!forward.empty()) 
			forward.clear();
	}
	
	public static void goForward() {
		if (!forward.empty()) 
			back.push(forward.pop());
	}
	
	public static void goBack() {
		if (!back.empty()) 
			forward.push(back.pop());
	}

}

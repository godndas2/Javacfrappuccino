package loop.test;

public class ForLoop {
	
	public void forLoop(int forloop) { // forloop : main메소드에서 넣어주는 숫자(int형)
		int sum = 0;
		for (int i = 1; i <= forloop; i++) {
			System.out.println("sum : " +sum);
			System.out.println("i : " +i);
			sum+=i; // sum = sum + 1
		}
		System.out.println("1 ~ 10을 더하면 : " + sum);
	}
	
	public static void main(String[] args) {
		ForLoop f = new ForLoop();
		f.forLoop(10); // 10은 forLoop()의  int forloop
	}

}

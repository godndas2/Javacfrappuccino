package loop.test;

public class InterestManager {
	
	public double getInterestRate(int day) { // 이자를 정해주는 메소드
		double rate ; // 이자율
		if (day <= 90) {
			rate = 0.5;
		} else if(day > 90 && day<= 180) {
			rate = 1;
		} else if(day > 180 && day < 365) {
			rate = 2;
		} else {
			rate = 5.6;
		}
		return rate;
	}
	
	public double calculateAmount(int day, long mount) { // day : 예금 거치 기간, mount : 예치 금액
		double totalAmount;
		double rate = getInterestRate(day);
		double rateAmount = mount * rate / 100.0; // 예치금액 * getInterestRate(day)의 return rate
		totalAmount  = mount + rateAmount; // 예치금 + 이자
		return totalAmount;
	}
	
	public static void main(String[] args) {
		InterestManager im = new InterestManager();
		
//		for (int day = 1; day <= 365; day++) {
//			double money = im.calculateAmount(day, 1000000);
//			System.out.println(day + ":" + money);
//		}
		
		for (int day = 10; day <= 370; day+=10) { // day += 10 : day = day+10
			double money = im.calculateAmount(day, 1000000);
			System.out.println(day + ":" + money);
		}
	}

}

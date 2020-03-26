package loop.test;

public class InterestManager {

    public double getInterestRate(int day) { // ���ڸ� �����ִ� �޼ҵ�
        double rate; // ������
        if (day <= 90) {
            rate = 0.5;
        } else if (day > 90 && day <= 180) {
            rate = 1;
        } else if (day > 180 && day < 365) {
            rate = 2;
        } else {
            rate = 5.6;
        }
        return rate;
    }

    public double calculateAmount(int day, long mount) { // day : ���� ��ġ �Ⱓ, mount : ��ġ �ݾ�
        double totalAmount;
        double rate = getInterestRate(day);
        double rateAmount = mount * rate / 100.0; // ��ġ�ݾ� * getInterestRate(day)�� return rate
        totalAmount = mount + rateAmount; // ��ġ�� + ����
        return totalAmount;
    }

    public static void main(String[] args) {
        InterestManager im = new InterestManager();

//		for (int day = 1; day <= 365; day++) {
//			double money = im.calculateAmount(day, 1000000);
//			System.out.println(day + ":" + money);
//		}

        for (int day = 10; day <= 370; day += 10) { // day += 10 : day = day+10
            double money = im.calculateAmount(day, 1000000);
            System.out.println(day + ":" + money);
        }
    }

}

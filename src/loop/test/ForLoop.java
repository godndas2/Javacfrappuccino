package loop.test;

public class ForLoop {

    public void forLoop(int forloop) { // forloop : main�޼ҵ忡�� �־��ִ� ����(int��)
        int sum = 0;
        for (int i = 1; i <= forloop; i++) {
            System.out.println("sum : " + sum);
            System.out.println("i : " + i);
            sum += i; // sum = sum + 1
        }
        System.out.println("1 ~ 10�� ���ϸ� : " + sum);
    }

    public static void main(String[] args) {
        ForLoop f = new ForLoop();
        f.forLoop(10); // 10�� forLoop()��  int forloop
    }

}

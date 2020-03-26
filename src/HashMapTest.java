package collection.test;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111"); // 3��° asdf��  �����ϱ� ������ ���� �߰��Ǵ� ��� ������ ���� �����.
        map.put("asdf", "1234");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id, Password�� �Է����ּ���");
            System.out.println("ID :");
            String id = sc.nextLine().trim();

            System.out.println("Password :");
            String pwd = sc.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("�Է��Ͻ� ID�� �������� �ʽ��ϴ�.");
                continue;
            } else {
                if (!(map.get(id)).equals(pwd)) {
                    System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
                    break;
                } else {
                    System.out.println("Id�� ��й�ȣ�� ��ġ�մϴ�.");
                    break;
                }
            }
        }
    }

}

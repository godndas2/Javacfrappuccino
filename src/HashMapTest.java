package collection.test;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111"); // 3번째 asdf가  존재하기 때문에 새로 추가되는 대신 기존의 값을 덮어쓴다.
		map.put("asdf", "1234");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("id, Password를 입력해주세요");
			System.out.println("ID :");
			String id = sc.nextLine().trim();
			
			System.out.println("Password :");
			String pwd = sc.nextLine().trim();
			System.out.println();
			
			if (!map.containsKey(id)) {
				System.out.println("입력하신 ID는 존재하지 않습니다.");
				continue;
			} else {
				if (!(map.get(id)).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다.");
					break;
				} else {
					System.out.println("Id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
	}

}

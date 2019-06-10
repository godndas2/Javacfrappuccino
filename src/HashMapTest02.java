package collection.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest02 {
	
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		addPhoneNo("친구", "홍길동", "010-1111-1111");
		addPhoneNo("친구", "홍길동2", "010-1234-1111");
		addPhoneNo("친구", "홍길동3", "010-4567-1111");
		addPhoneNo("회사", "홍길동4", "010-8910-1111");
		addPhoneNo("강아지", "홍길동5", "010-1313-1111");
		addPhoneNo("친구", "홍길동6", "010-8585-1111");
		addPhoneNo("누구세요", "010-4548-4519");
		printList();
	}
	
	// 그룹에 전화번호를 추가
	static void addPhoneNo(String grpName, String name, String tel) {
		addGrp(grpName);
		HashMap grp = (HashMap) phoneBook.get(grpName);
		grp.put(tel, name);
	}
	
	// 그룹 추가
	static void addGrp(String grpName) {
		if (!phoneBook.containsKey(grpName)) {
			phoneBook.put(grpName, new HashMap());
		}
	}
	
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}
	
	// 전화번호부 전체 출력
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			
			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * " + e.getKey() + "["+subSet.size()+"]");
			
			while (subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}
	}

}

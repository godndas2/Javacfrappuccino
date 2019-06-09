package collection.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class IteratorTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
//		Iterator it = list.iterator();
//		
//		while (it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
		
		ListIterator it = list.listIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next()); // 순방향
		}
		System.out.println();
		
		while (it.hasPrevious()) {
			System.out.println(it.previous()); // 역방향
		}
		System.out.println();
		
	}

}

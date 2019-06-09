package collection.test;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(100000);
		LinkedList ll = new LinkedList();
		add1(al);
		add1(ll);
		
		System.out.println("== 접근시간 테스트하기 ==");
		System.out.println("ArrayList :"+access(al));
		System.out.println("LinkedList :"+access(ll));
	}
	
	public static void add1(List list) {
		for (int i = 0; i < 1000000; i++) 
			list.add(i+"");
	}
	
	public static long access(List list) {
		long strt = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) 
			list.get(i);
			long end = System.currentTimeMillis();
			return end - strt;
	}
	
//	public static long remove1(List list) {
//		long strt = System.currentTimeMillis();
//		for (int i = list.size()-1; i >= 0; i--) 
//			list.remove(i);
//			long end = System.currentTimeMillis();
//			return end - strt;
//	}

}

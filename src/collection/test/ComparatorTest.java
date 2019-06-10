package collection.test;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
	
	public static void main(String[] args) {
		String[] strArr = {"A","C","B","D"};
		
		Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안함
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); // 역순 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역으로 변경
		}
		return -1;
	}
}

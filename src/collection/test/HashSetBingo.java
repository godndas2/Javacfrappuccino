package collection.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetBingo {

	public static void main(String[] args) {
//		Set set = new HashSet();
		Set set = new LinkedHashSet();
		int	[][] board = new int[5][5];
		
		for (int i = 0; set.size() < 25; i++) {
			set.add((int)(Math.random() * 50) + 1 +"");
		}
		
		Iterator it = set.iterator();
		
		for (int i = 0; i < board.length; i++) {
			for (int k = 0; k < board[i].length; k++) {
				board[i][k] = Integer.parseInt((String)it.next());
				System.out.print((board[i][k] < 10 ? " " : " ") + board[i][k]);
			}
			System.out.println();
		}
	}

}

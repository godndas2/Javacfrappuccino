package array.test;

public class ManageHeight {
	
	int gradeHeights [][]; 
	
	public void setDate() {
		gradeHeights = new int[5][];
		// 1~5¹Ý
		gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
		gradeHeights[1] = new int[] {180, 165, 167, 186};
		gradeHeights[2] = new int[] {158, 177, 187, 176};
		gradeHeights[3] = new int[] {173, 182, 181};
		gradeHeights[4] = new int[] {170, 180, 165, 177, 172};
	}
	
	public void printHeight(int classNo) {
		System.out.println("ClassNo." + classNo); // classNo.1
		for (int height : gradeHeights[classNo - 1]) { // gradeHeights[0]
			System.out.println("Å° : " +height);
		}
	}
	
	public void printAvg(int classNo) {
		System.out.println("ClassNo." + classNo);
		double sum = 0;
		int classHeight = gradeHeights[classNo - 1].length; // gradeHeights[0].length -> 5
		
		for (int data : gradeHeights[classNo - 1]) { // gradeHeights[0] -> 170, 180, 173, 175, 177
			sum+=data; // sum = sum + data
		}
		System.out.println("Å° Æò±Õ : " + sum / classHeight); 
	}
	public static void main(String[] args) {
		ManageHeight m = new ManageHeight();
		m.setDate();
		
		for (int classNo = 1; classNo <= 5; classNo++) {
//			m.printHeight(classNo);
			m.printAvg(classNo);
		}
	}
}

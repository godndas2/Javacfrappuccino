package github.bmicalculator;

import java.util.Scanner;

public class BMICal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력하세요 [예]: 180.8 80.1");
		
		double tall = sc.nextDouble() /100;
		double weight = sc.nextDouble();
		double bmi = weight/ (tall * tall);
		
		if (bmi < 18.5) 
			System.out.println("저체중입니다.");
		else if(bmi < 23)
			System.out.println("정상체중입니다.");
		else if(bmi < 25)
			System.out.println("과체중입니다.");
		else
			System.out.println("비만입니다.");
}
}
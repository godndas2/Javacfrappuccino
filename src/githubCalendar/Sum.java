package githubCalendar;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String s1, s2;
        System.out.println("두 수를 입력하세요");

        s1 = sc.next();
        s2 = sc.next();

        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);

        System.out.printf("%d + %d의 합은 %d 입니다", a, b, a + b);
        sc.close();
    }

}

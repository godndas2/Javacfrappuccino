package huhyun;

import java.util.Scanner;

/**
 * @author halfdev
 * @since 2020-03-25
 * 문자열 -> 초성 추출
 */
public class SentenceConvertInitial {

    private static String getTextToInitial(String text) {
        // JS fromCharCode. ?
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            // 자음과 모음이 모여서 문자로 생성되는 시작위치는 0xAC00부터 시작된다.
            char iVal = (char) (text.charAt(i) - 0xAC00);
            // 모든 한글 낱자 : 11172
            if (iVal <= 11172) {
                /*
                    0x1100 : ㄱ
                    Unicode 초성 분리
                */
                char initial = (char) ((((iVal - (iVal % 28)) / 28) / 21) + 0x1100);
                result += initial;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Input Text === ");
        String str = scanner.nextLine();
        String textToInitial = getTextToInitial(str);
        System.out.println(textToInitial);
    }
}

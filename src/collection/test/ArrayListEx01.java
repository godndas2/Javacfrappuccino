package collection.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

    public static void main(String[] args) {
        final int LIMIT = 10;
        String src = "0123456789�����ٶ󸶹ٻ����ABCDEFGHI";
        int length = src.length();

        List list = new ArrayList<>(length / LIMIT + 10);

        for (int i = 0; i < length; i += LIMIT) {
            if (i + LIMIT < length) {
                list.add(src.substring(i, LIMIT));
            } else {
                list.add(src.substring(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}


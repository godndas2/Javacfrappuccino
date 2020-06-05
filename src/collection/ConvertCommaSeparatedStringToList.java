package collection;

import java.util.Arrays;
import java.util.List;

public class ConvertCommaSeparatedStringToList {
    public static void main(String[] args) {
        String alpha = "A, B, C, D";

        //Remove whitespace and split by comma
        List<String> list = Arrays.asList(alpha.split("\\s*,\\s*"));
        System.out.println(list); // [A, B, C, D]

        // List to Comma-separated String
        List<String> list2 = Arrays.asList("A", "B", "C", "D");
        String join = String.join(",", list2);
        System.out.println(join); // A,B,C,D


    }
}

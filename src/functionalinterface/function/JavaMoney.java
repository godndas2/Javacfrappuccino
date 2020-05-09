package functionalinterface.function;

import java.util.function.Function;

public class JavaMoney {
    public static void main(String[] args) {

        Function<String, Integer> strLenExtract = x -> x.length();
        Function<Integer, Integer> multiCalc = x -> x * 2;


        Integer funcApply = strLenExtract.apply("money:>:>::");
        System.out.println("몇 글자일까: " + funcApply);

        Integer result = strLenExtract.andThen(multiCalc).apply("money:>:>::");
        System.out.println("Length * 2: " + result);

        
    }
}

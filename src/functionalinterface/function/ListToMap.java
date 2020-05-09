package functionalinterface.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ListToMap {
    public static void main(String[] args) {

        ListToMap obj = new ListToMap();
        List<String> language = Arrays.asList("Node.js","Python","Java","C++");

        // lambda
         Map<String, Integer> map = obj.convertListToMap(language, x -> x.length());
        System.out.println("lambda: " + map);

        // method reference
        Map<String, Integer> map2 = obj.convertListToMap(language, obj::getLength);
        System.out.println("method reference: " + map2);
    }

    // T, R : Parameter, Return
    public <T,R> Map<T,R> convertListToMap(List<T> list, Function<T, R> func) {
        Map<T,R> result = new HashMap<>();
        for (T key : list) {
            result.put(key, func.apply(key));
        }
        return result;
    }

    public Integer getLength(String str) {
        return str.length();
    }
}

package functionalinterface.function;

import java.util.*;
import java.util.function.BiFunction;
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

        // filterList
        List<Integer> num = Arrays.asList(1,2,3,4,5);

        List<Integer> result = obj.filterList(num, 2, (l1, condition) -> {
            if (l1 % condition == 0) {
                return l1;
            } else {
                return null;
            }
        });

        System.out.println(result);

        // filterByLength()
        List<String> strFilterByLeng = obj.filterList(language, 3, obj::filterByLength);

        System.out.println(strFilterByLeng);
    }

    // Function<T, R> : 객체 T를 객체 R로 매핑
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

    /*
    * BiFunction<T,U,R> : 객체 T, U를 객체 R로 매핑
    *
     */
    public <T,U,R> List<R> filterList(List<T> list1, U condition, BiFunction<T,U,R> func) {
        List<R> result = new ArrayList<>();

        for (T t: list1) {
            R apply = func.apply(t, condition);
            if (apply != null) {
                result.add(apply);
            }
        }
        return result;
    }

    public String filterByLength(String str, Integer size) {
        if (str.length() > size) {
            return str;
        } else {
            return null;
        }
    }
}

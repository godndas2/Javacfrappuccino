package stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectors {
    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        // Group by a List and display the total count of it.
        Map<String, Long> collect = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect); // {papaya=1, orange=1, banana=2, apple=3}

        // Add sorting
        Map<String, Long> finalMap = new LinkedHashMap<>();

        // forEachOrdered : 스트림이 순차적인지 병렬인지에 관계없이 소스에서 지정한 순서대로 스트림 요소를 처리
        collect.entrySet().stream()
                .sorted(Map.Entry.<String, Long> comparingByValue()
                .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        System.out.println(finalMap); // {apple=3, banana=2, papaya=1, orange=1}

        // TODO List Objects
    }
}

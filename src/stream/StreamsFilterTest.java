package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterTest {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("spring", "node", "python");
        List<String> stringList = getFilterOutput(lines, "node");

        System.out.println("[ Before Stream Ver ]");
        for (String s : stringList) {
            System.out.println(s); // spring, python
        }

        System.out.println("[ Stream Ver ]");
        lines.stream()
                .filter(line -> !"node".equals(line))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    // Before Java 8 Version
    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"node".equals(line)) {
                result.add(line);
            }
        }
        return result;
    }
}

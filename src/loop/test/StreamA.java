package loop.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
* @author halfdev
* @since 2020-01-20
* 생성하기 : 스트림 인스턴스 생성.
* 가공하기 : 필터링(filtering) 및 맵핑(mapping) 등 원하는 결과를 만들어가는 중간 작업(intermediate operations).
* 결과 만들기 : 최종적으로 결과를 만들어내는 작업(terminal operations).
*/
public class StreamA {

    // Arrays.stream
    String[] arr = new String[]{"a","b","c"};
    Stream<String> stream = Arrays.stream(arr);
    Stream<String> streamOfArrayPart =
            Arrays.stream(arr,1,3); // b,c

    // Collection Type Stream
    List<String> list = Arrays.asList("a","b","C");
    Stream<String> streamList = list.stream();
    Stream<String> paralleStream = list.parallelStream(); // 병렬처리스트림

    // Filtering
    List<String> names = Arrays.asList("Aaa","Bbb","Ccc");
    Stream<String> streamFilter = names.stream()
            .filter(name -> name.contains("A")); // AAA -> 'A' 만 리턴

    // Mapping : 스트림에 들어가 있는 값이 input 이 되어서 특정 로직을 거친 후 output 이 되어 (리턴되는) 새로운 스트림에 담기게 됩니다
    Stream<String> streamMapping = names.stream()
            .map(String::toUpperCase); // 대문자로 변환하여 리턴

}

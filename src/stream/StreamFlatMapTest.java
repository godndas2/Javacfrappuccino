package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
* @author halfdev
* @since 2020-05-21
 *
*  In Java 8, Stream can hold different data types, for examples:
 * Stream<String[]>
 * Stream<Set<String>>
 * Stream<List<String>>
 * Stream<List<Object>>
 *
 *
But, the Stream operations (filter, sum, distinct…) and collectors do not support it,
so, we need flatMap() to do the following conversion :

Stream<String[]>		-> flatMap ->	Stream<String>
Stream<Set<String>>	-> flatMap ->	Stream<String>
Stream<List<String>>	-> flatMap ->	Stream<String>
Stream<List<Object>>	-> flatMap ->	Stream<Object>


How flatMap() works : 단일 원소로 return 받을 수 있다.

{ {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}

{ {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}

 */
public class StreamFlatMapTest {
    public static void main(String[] args) {

        // Stream + String[] + flatMap
        String [][] data = new String[][]{{"a","b"},{"c","d"},{"e","f"}};

        // Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);
        //filter a stream of string[], and return a string[]?
        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));
        stream.forEach(System.out::println); // empty

        // Solution
        Stream<String> stream1 = Arrays.stream(data)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> "a".equals(x.toString()));
        stream1.forEach(System.out::println); // a

        // Stream + Set + flatMap
        Student obj = new Student();
        obj.setName("halfdev");
        obj.addBook("Java 8");
        obj.addBook("Springboot");
        obj.addBook("Kubernetes");

        Student obj2 = new Student();
        obj2.setName("gazero");
        obj2.addBook("Java 14");
        obj2.addBook("Kubernetes");

        List<Student> students = new ArrayList<>();
        students.add(obj);
        students.add(obj2);

        List<String> collect = students.stream()
                .map(x -> x.getBook()) // Stream<Set<String>>
                .flatMap(x -> x.stream()) // Stream<String>
                .distinct()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        // Stream + Primitive + flatMapToInt
        int [] arrayInt = {1,2,3,4,5,6};

        // Stream<int[]>
        Stream<int[]> streamArray = Stream.of(arrayInt);
        // Stream<int[]> -> flatMap -> IntStream
        IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));
        intStream.forEach(x -> System.out.println(x)); // 1,2,3,4,5,6
    }

    static class Student {
        private String name;
        private Set<String>  book;

        public void addBook(String book) {
            if (this.book == null) {
                this.book = new HashSet<>();
            }
            this.book.add(book);
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBook(Set<String> book) {
            this.book = book;
        }

        public String getName() {
            return name;
        }

        public Set<String> getBook() {
            return book;
        }
    }
}

package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPerson {
    public static void main(String[] args) {
        // Before version
        List<Person> people = Arrays.asList(
                new Person("halfdev", 26),
                new Person("gazero", 28),
                new Person("dori", 2)
        );

        Person result = getStudentByName(people, "halfdev");
        System.out.println("BEFORE VER: " + result); // Person{name='halfdev', age=26}

        // stream
        Person resultA = people.stream()
                .filter(x -> "halfdev".equals(x.getName()))
                .findAny() // If 'findAny' then return found
                .orElse(null);
        System.out.println("STREAM VER: " + resultA); // Person{name='halfdev', age=26}

        Person resultB = people.stream()
                .filter(x -> "who".equals(x.getName()))
                .findAny()
                .orElse(null);
        System.out.println("STREAM VER: " + resultB); // null

        // stream multiple condition
        Person resultC = people.stream()
                .filter(x -> "halfdev".equals(x.getName()) && 26 == x.getAge())
                .findAny()
                .orElse(null);
        System.out.println("STREAM VER: " + resultC);

        // stream map()
        String name = people.stream()
                .filter(x -> "halfdev".equals(x.getName()))
                .map(Person::getName)
                .findAny()
                .orElse("");
        System.out.println("STREAM VER: " + name); // halfdev

        List<String> list = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        list.forEach(System.out::println); // halfdev gazero dori
    }

    // for Before Version
    private static Person getStudentByName(List<Person> people, String name) {
        Person result = null;
        for (Person person : people) {
            if (name.equals(person.getName())) {
                result = person;
            }
        }
        return result;
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}

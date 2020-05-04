package imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people =
                Arrays.asList(
                        new Person("Steve", MALE),
                        new Person("Alice", FEMALE),
                        new Person("HALFDEV", MALE),
                        new Person("GAZERO", FEMALE),
                        new Person("Dori", MALE)
                );
        System.out.println("// Imperative approach 명령적 접근 //");
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println("female: " + female);
        }

        System.out.println("// Declarative approach 선언적 접근 //");
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        // jdk 5 부터 추가된 forEach, List 를 돌릴 땐 for 문 말고 forEach 를 사용하는게 좋다 or Iterator
        females2.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }

    enum Gender {
        MALE,
        FEMALE
    }
}

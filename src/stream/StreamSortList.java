package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");

        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        collect.forEach(System.out::println); // 1 4 9 A B Y Z a c

        // reserve
        List<String> collect1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        collect1.forEach(System.out::println); // a c c a Z Y B A 9 4 1

        // List Objects
        List<User> users = Arrays.asList(
                new User("C", 30),
                new User("D", 40),
                new User("A", 10),
                new User("B", 20),
                new User("E", 50));

        List<User> collect2 = users.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());
        collect2.forEach(System.out::println); // User{name='A', age=10} User{name='B', age=20} User{name='C', age=30} User{name='D', age=40} User{name='E', age=50}


    }

    static class User {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

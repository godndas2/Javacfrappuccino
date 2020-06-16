package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class doTestOptional {
    public static void main(String[] args) {
        House house = getRandomeHouse();

//        System.out.println(house.getOwner().getName()); // 주인이 없는 집이라면 NPE 발생

        String ownerName = Optional.of(house)
                .map(House::getOwner)
                .map(Person::getName)
                .orElse("주인 없는 집");

        String address = Optional.of(house)
                .map(House::getAddress)
                .orElse("아직 주소가 발급되지 않았습니다.");

        System.out.println("owner : " + ownerName); // owner : tester
        System.out.println("address : " + address); // address : Seoul

        Map<String, Object> map = new HashMap<>();
        map.put("tester", house.getOwner().getName());
        map.put("Seoul", house.getAddress());

        map.forEach((k, v) -> {
            System.out.println("map : " + k + " Count : " + v); // map : Seoul Count : Seoul, map : tester Count : tester
            if ("Seoul".equals(k)) {
                System.out.println("This is Seoul"); // This is Seoul
            }
        });
    }

    static House getRandomeHouse() {
        House house = new House();
        Person person = new Person();
        person.setName("tester"); //
        house.setAddress("Seoul"); //
        house.setOwner(person); //
        return house;
    }

    static class Person {
        private String name;
        private int age;

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

    static class House {
        private Person owner;
        private String address;

        public void setOwner(Person owner) {
            this.owner = owner;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Person getOwner() {
            return owner;
        }

        public String getAddress() {
            return address;
        }
    }
}

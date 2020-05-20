package stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");

        // Before
        List<String> upperCase = new ArrayList<>();
        for (String s : list) {
            upperCase.add(s.toUpperCase());
        }
        System.out.println(list); // [a, b, c, d]
        System.out.println(upperCase); // [A, B, C, D]

        // stream
        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); // [A, B, C, D]

        // stream other test case
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        List<Integer> collectA = integers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collectA); // [2, 4, 6, 8, 10]

        // List of objects -> List of String
        List<Staff> staff = Arrays.asList(
                new Staff("halfdev", 26, new BigDecimal(10000)),
                new Staff("gazero", 28, new BigDecimal(20000)),
                new Staff("tester", 30, new BigDecimal(30000))
        );

        // Before
        List<String> result = new ArrayList<>();
        for (Staff x : staff) {
            result.add(x.getName());
        }
        System.out.println(result); // [halfdev, gazero, tester]

        // stream
        List<String> collectC = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(collectC); // [halfdev, gazero, tester]

        // List of objects -> List of other objects
        // convert a list of staff objects into a list of StaffPublic objects
        List<StaffPublic> staffList = convertToStaffPublic(staff);
        System.out.println(staffList);

    }

    private static List<StaffPublic> convertToStaffPublic(List<Staff> staff) {
        List<StaffPublic> result = new ArrayList<>();
        for (Staff staffs : staff) {
            StaffPublic obj = new StaffPublic();
            obj.setName(staffs.getName());
            obj.setAge(staffs.getAge());
            if ("halfdev".equals(staffs.getName())) {
                obj.setExtra("This field is for halfdev Only!");
            }
            result.add(obj);
        }

        return result;
    }

    static class Staff {
        private String name;
        private int age;
        private BigDecimal salary;

        @Override
        public String toString() {
            return "Staff{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public Staff(String name, int age, BigDecimal salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
    }

    static class StaffPublic {
        private String name;
        private int age;
        private String extra;

        public StaffPublic() {
        }

        @Override
        public String toString() {
            return "StaffPublic{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", extra='" + extra + '\'' +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setExtra(String extra) {
            this.extra = extra;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getExtra() {
            return extra;
        }

        public StaffPublic(String name, int age, String extra) {
            this.name = name;
            this.age = age;
            this.extra = extra;
        }
    }
}

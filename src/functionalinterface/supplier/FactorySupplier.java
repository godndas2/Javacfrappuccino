package functionalinterface.supplier;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

public class FactorySupplier {
    public static void main(String[] args) {
        Developer obj = factoy(Developer::new);
        System.out.println(obj); // Developer{name='DEFAULT', salary=1, start=2020-05-15}

        Developer obj2 = factoy(() -> new Developer("halfdev"));
        System.out.println(obj2); // Developer{name='halfdev', salary=1, start=2020-05-15}

    }

    /* <? extends T>
        ? : 자식 클래스 T : 부모 클래스
        부모클래스와 자식클래스의 임의의 자료형만 받는다.
    * */
    public static Developer factoy(Supplier<? extends Developer> s) {
        Developer developer = s.get();
        if (developer.getName() == null || "".equals(developer.getName())) {
            developer.setName("DEFAULT");
        }
        developer.setSalary(BigDecimal.ONE);
        developer.setStart(LocalDate.of(2020,5,15));

        return developer;
    }


    public static class Developer {
        private String name;
        private BigDecimal salary;
        private LocalDate start;
        private int age;

        public Developer(String name) {
            this.name = name;
        }

        public Developer() {
        }

        public Developer(String name, BigDecimal salary, int age) {
            this.name = name;
            this.salary = salary;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Developer{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", start=" + start +
                    ", age=" + age +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }

        public void setStart(LocalDate start) {
            this.start = start;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public LocalDate getStart() {
            return start;
        }

        public int getAge() {
            return age;
        }
    }

}

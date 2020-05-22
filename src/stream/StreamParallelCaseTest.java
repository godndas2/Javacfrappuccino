package stream;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Paths.get;

/**
* @author halfdev
* @since 2020-05-22
* Parallel streams to increase the performance of a time-consuming save file tasks.
 *
 * This Java code will generate 10,000 random employees and save into 10,000 files, each employee save into a file.
 *
 * For normal stream, it takes 27-29 seconds.
 * For parallel stream, it takes 7-8 seconds.
*/
public class StreamParallelCaseTest {
    private static final String DIR = System.getProperty("user.dir") + "/test/";

    public static void main(String[] args) throws IOException {

        Files.createDirectories(get(DIR));

        StreamParallelCaseTest obj = new StreamParallelCaseTest();
        List<Employee> employees = obj.generateEmployee(10000);

        // Normal Stream
        employees.stream().forEach(StreamParallelCaseTest::save); // 27s-29s
        employees.parallelStream().forEach(StreamParallelCaseTest::save); // 7s-8s
    }

    private static void save(Employee input) {

        try (FileOutputStream fos = new FileOutputStream(new File(DIR + input.getName() + ".txt"));
             ObjectOutputStream obs = new ObjectOutputStream(fos)) {
            obs.writeObject(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    private List<Employee> generateEmployee(int num) {
        return Stream.iterate(0, n -> n + 1)
                .limit(num)
                .map(x -> {
                    return new Employee(
                            generateRandomName(4),
                            generateRandomAge(15,100),
                            generateRandomSalary(900.00, 200_000.00)
                    );
                })
                .collect(Collectors.toList());
    }

    private String generateRandomName(int length) {
        return new Random()
                .ints(5,97,122) // 97 = a, 122 = z
                .mapToObj(x -> String.valueOf((char) x))
                .collect(Collectors.joining());
    }

    private int generateRandomAge(int min, int max) {
        return new Random()
                .ints(1, min, max)
                .findFirst()
                .getAsInt();
    }

    private BigDecimal generateRandomSalary(double min, double max) {
        return new BigDecimal(new Random()
        .doubles(1,min,max)
        .findFirst()
        .getAsDouble()).setScale(2, RoundingMode.HALF_UP);
    }

    static class Employee implements Serializable {
        private static final long serialVersionUID = 1L;

        private String name;
        private int age;
        private BigDecimal salary;

        public Employee(String name, int age, BigDecimal salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employy{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }

        public static long getSerialVersionUID() {
            return serialVersionUID;
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
    }
}

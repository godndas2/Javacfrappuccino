package huhyun.toys;

import java.time.LocalDate;

/**
* @author halfdev
* @since 2020-05-06
* Toy Provider
*/
public class Toy {

    private final Long id;
    private final String colors;
    private final double size;

    public Toy(Long id, String colors, double size, Lego legoName) {
        this.id = id;
        this.colors = colors;
        this.size = size;
    }

    public Toy(Long id, String colors, double size) {
        this.id = id;
        this.colors = colors;
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public String getColors() {
        return colors;
    }

    public double getSize() {
        return size;
    }

    // Lego
    static class Lego {
        private final String name;
        private final LocalDate manufacturingYear;
        private final LocalDate age;

        public Lego(String name, LocalDate manufacturingYear, LocalDate age) {
            this.name = name;
            this.manufacturingYear = manufacturingYear;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public LocalDate getManufacturingYear() {
            return manufacturingYear;
        }

        public LocalDate getAge() {
            return age;
        }
    }
}

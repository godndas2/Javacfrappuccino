package huhyun;

public class BooleanEquals {
    static class Someting {
        private int age;
        private String name;

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Someting someting = new Someting();
        someting.setAge(26);
        someting.setName("Halfdev");

        Someting someting2 = new Someting();
        someting2.setAge(26);
        someting2.setName("Halfdev");

        System.out.println(someting.equals(someting2)); // false
        /*
        * false 인 이유
        * public boolean equals(Object obj) {
              return (this == obj);
          }
        * */

        // Solution
        System.out.println(someting.getName().equals(someting2.getName()) || someting.getAge() == someting2.getAge()); // true
    }
}

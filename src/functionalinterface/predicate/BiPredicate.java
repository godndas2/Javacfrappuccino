package functionalinterface.predicate;

public class BiPredicate {
    public static void main(String[] args) {

        java.util.function.BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("halfdev", 7);
        System.out.println(result); // true

        boolean result2 = filter.test("JAVA", 14);
        System.out.println(result2); // false
    }
}

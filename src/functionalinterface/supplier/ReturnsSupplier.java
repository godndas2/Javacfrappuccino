package functionalinterface.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ReturnsSupplier<T> {
    public static void main(String[] args) {
        ReturnsSupplier<String> obj = new ReturnsSupplier();
        List<String> list = obj.supplier().get();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list); // [1,2,3,4]
    }

    public Supplier<List<T>> supplier() {
//        return () -> new ArrayList<>();
        return ArrayList::new;
    }
}

package functionalinterface.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
* @author halfdev
* @since 2020-05-05
* Parameter 를 받지 않고 특정 Type 결과를 Return 하는 Interface
*/
public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:1234/users";
    }

    static Supplier<List<String>> getDBConnectionUrlsSupplier = ()
            -> Arrays.asList(
                    "jdbc://localhost:1234/users",
                    "jdbc://localhost:1234/customer"
                );
}

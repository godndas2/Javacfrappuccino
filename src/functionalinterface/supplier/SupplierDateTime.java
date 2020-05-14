package functionalinterface.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierDateTime {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {

        Supplier<LocalDateTime> localDateTimeSupplier = () -> LocalDateTime.now();
        LocalDateTime time = localDateTimeSupplier.get();
        System.out.println(time);

        Supplier<String> str = () -> dtf.format(LocalDateTime.now());
        String s = str.get();
        System.out.println(s);


    }
}

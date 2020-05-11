package functionalinterface.predicate.hosting;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HostingRespository {

    public static List<Hosting> filterHosting(List<Hosting> hosting,
                                              Predicate<Hosting> predicate) {
        return hosting.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}

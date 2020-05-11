package functionalinterface.predicate.hosting;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class HostingMain {
    public static void main(String[] args) {
        Hosting h1 = new Hosting(1, "amazon", "aws.amazon.com");
        Hosting h2 = new Hosting(2, "ms", "ms.com");
        Hosting h3 = new Hosting(3, "naver", "naver.com");
        Hosting h4 = new Hosting(4, "google", "google.com");

        List<Hosting> hostings = Arrays.asList(new Hosting[]{h1, h2, h3, h4});

        List<Hosting> filterHostingList = HostingRespository.filterHosting(hostings, x -> x.getName().startsWith("n"));
        System.out.println("filterHostingList: " + filterHostingList); // naver

        List<Hosting> hostingList = HostingRespository.filterHosting(hostings, isForHalfDevMethod());
        System.out.println("hostingList: " + hostingList);

    }

    static Predicate<Hosting> isForHalfDevMethod() {
        return n -> n.getName().equals("google");
    }
}

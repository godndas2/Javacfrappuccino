package Lambdas;

import functionalinterface.supplier.FactorySupplier.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
* @author halfdev
* @since 2020-05-17
* Java 8 Lambda expression to write a Comparator to sort a List.
*/
public class ComparatorListSort {
    public static void main(String[] args) {
        /*
        * Sort Without Lambda
        */
        List<Developer> listDevs = getDevelopers();

        System.out.println("[ BEFORE SORT ]");

        for (Developer listDev : listDevs) {
            System.out.println(listDev);
        }

        // Sort by age
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("[ AFTER SORT ]");

        for (Developer listDev : listDevs) {
            System.out.println(listDev);
        }

        // If requirement is changed, just pass in another new anonymous Comparator class
        // Sort by salary
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        System.out.println("[ Sort Salary ]");

        for (Developer listDev : listDevs) {
            System.out.println(listDev);
        }

        // Sort With Lambda
        System.out.println("[ Sort With Lambda ]");
        listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());
        listDevs.forEach((developer) -> System.out.println(developer));
//        listDevs.forEach(System.out::println);

        // More Lambda Examples
        System.out.println("[ Sort Name ]");
        listDevs.sort((o1,o2) -> o1.getName().compareTo(o2.getName()));
        listDevs.forEach(System.out::println);
    }

    public static List<Developer> getDevelopers() {
        List<Developer> result = new ArrayList<>();
        result.add(new Developer("halfdev", new BigDecimal("70000"), 26));
        result.add(new Developer("jason", new BigDecimal("80000"), 30));
        result.add(new Developer("gazero", new BigDecimal("90000"), 28));

        return result;
    }
}

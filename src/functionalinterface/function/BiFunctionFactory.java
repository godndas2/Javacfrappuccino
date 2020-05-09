package functionalinterface.function;

import java.util.function.BiFunction;

/**
* @author halfdev
* @since 2020-05-10
* acts as a factory pattern.
*/
public class BiFunctionFactory {
    public static void main(String[] args) {
        /*
        * The GPS::new calls the following constructor,
        * which accepts two arguments and return an object (GPS), so it matches with the BiFunction signature.
        /
         */
        GPS obj = factory("40.741895", "-73.989308", GPS::new);
        System.out.println(obj);
    }

    // R : Return
    static <R extends GPS> R factory(String Latitude, String Longitude,
                                   BiFunction<String, String, R> func) {

        return func.apply(Latitude, Longitude);
    }

    static class GPS {

        String Latitude;
        String Longitude;

        public GPS(String latitude, String longitude) {
            Latitude = latitude;
            Longitude = longitude;
        }

        @Override
        public String toString() {
            return "GPS{" +
                    "Latitude='" + Latitude + '\'' +
                    ", Longitude='" + Longitude + '\'' +
                    '}';
        }
    }
}

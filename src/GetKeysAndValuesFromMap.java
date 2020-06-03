import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GetKeysAndValuesFromMap {
    public static void main(String[] args) {
        // we can get the keys and values via map.entrySet()
        Map<String, String> map = new HashMap<>();
        map.put("db", "mysql");
        map.put("username", "root");
        map.put("password", "1234");

        // Get keys and values
        for (Map.Entry<String,String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key : " + key + ", Value : " + value);
        }

        // Get All Keys
        Set<String> key = map.keySet();
        for (String s : key) {
            System.out.println("Key : " + s);
        }

        // Get All Values
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println("Value : " + value);
        }

        // stream
        map.forEach((k, v) -> {
            System.out.println("Key : " + k + ", Value : " + v);
        });

        // filtering
        map.entrySet().stream()
                .filter(x -> "1234".equals(x.getValue()))
                .forEach(x -> System.out.println("Key : " + x.getKey() + ", Value : " + x.getValue()));



    }
}

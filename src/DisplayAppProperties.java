import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class DisplayAppProperties {
    public static void main(String[] args) {
        // display all System properties
        Properties properties = System.getProperties();

        // java8
//        properties.forEach((k ,v) -> System.out.println(k + ":" + v));

        // Alphabetical order
        // Thanks Java 8
        LinkedHashMap<String, String> collect = properties.entrySet().stream()
                .collect(Collectors.toMap(k -> (String) k.getKey(), e -> (String) e.getValue()))
                .entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        collect.forEach((k, v) -> System.out.println(k + ":" + v));
        /*
        *   awt.toolkit:sun.awt.windows.WToolkit
            file.encoding:UTF-8
            file.encoding.pkg:sun.io
            file.separator:\
            intellij.debug.agent:true
            java.awt.graphicsenv:sun.awt.Win32GraphicsEnvironment
        *   .
        *   .
        *   .
        *   user.country:KR
            user.dir:D:\workspace\study\javathread
            user.home:C:\Users\HalfDev
            user.language:ko
            user.name:HalfDev
            user.script:
            user.timezone:
            user.variant:
        *
        *
        *
        * */

    }
}

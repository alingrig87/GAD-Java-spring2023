package MapInterfaceExamples;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Costel", 23);
        map.put("Ionel", 44);
        map.put("Daniel", 25);

        System.out.println(map.get("Costel"));

        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}

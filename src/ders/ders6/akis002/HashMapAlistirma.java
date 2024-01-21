package src.ders.ders6.akis002;

import java.util.HashMap;
import java.util.Map;

public class HashMapAlistirma {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C", 3);

        System.out.println(map);

       /* map.remove("Python");
        System.out.println(map);*/

        System.out.println(map.get("Java"));
        System.out.println(map.containsKey("C"));
        System.out.println(map.containsKey("C1"));

        System.out.println(map.containsValue(1));


        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        for (Integer value : map.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}

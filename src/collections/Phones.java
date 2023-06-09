package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phones {
    public static void main(String[] args) {
        Map<String, String> phones = new HashMap<>();
        phones.put("Tomek", "567-234-367");
        phones.put("Alicja", "567-234-987");
        phones.put("Tomek", "999-999-999");
        phones.put("Barbara", "999-999-999");

        Set<String> keys = phones.keySet();
        System.out.println(keys);

        System.out.println(phones.containsKey("Alicja"));
        System.out.println(phones.containsKey("Marcin"));

        System.out.println(phones.get("Alicja"));
        System.out.println(phones.get("Marek"));

        System.out.println();
        for (String key : phones.keySet()) {
            System.out.println(key + " -> " + phones.get(key));
        }

        System.out.println();
        for (String value : phones.values()){
            System.out.println(value);
        }

        for (Map.Entry entry : phones.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        for (Map.Entry entry : phones.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue("0");
        }
        System.out.println(phones);
    }
}
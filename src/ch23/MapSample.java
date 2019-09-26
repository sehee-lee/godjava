package ch23;

import java.util.HashMap;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkHashMap();
        sample.checkTreeMap();
    }
    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        Collection<String> values = map.values();
        for (String tempValue : values) {
            System.out.println(tempValue);
        }
    }
    public void checkTreeMap() {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("Z", "z");
        map.put("A", "a");
        map.put("B", "b");
        map.put("D", "d");
        map.put("C", "c");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> tempEntry : entries) {
            System.out.println(tempEntry.getKey() + " = " + tempEntry.getValue());
        }
    }
}

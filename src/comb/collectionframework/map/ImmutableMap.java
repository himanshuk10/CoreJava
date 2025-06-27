package comb.collectionframework.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map);
        System.out.println(map2);
//        map2.put("C",4);
//        map.put("C",4);
        //yaha map2 change nahi hoga  but map to change hoga hi na
        Map<String, Integer> map3 = Map.of("Subham", 91, "Vivek", 98);//limited upto 10 entry
//        map3.put("Aman", 88);
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Akahay", 98), Map.entry("Vivek", 99));


    }
}

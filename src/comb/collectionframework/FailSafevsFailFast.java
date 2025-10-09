package comb.collectionframework;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Fail-fast iterators immediately throw a ConcurrentModificationException if the collection is
 * modified structurally (add, remove, etc.) while iterating over it.
 */

public class FailSafevsFailFast {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();//fail-fast
        List<String> names = new CopyOnWriteArrayList<>();
        names.add("aman");
        names.add("mohan");
        names.add("ramesh");

        Iterator iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            if (!names.contains("rohan")){
                names.add("rohan");
            }
        }
        System.out.println("..........."+names);

        System.out.println("Map..............................................");


        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Charlie", 1234);
        map.put("Bob", 123);
        map.put("Alice", 234);
        map.put("John", 45);
//
//        Iterator<Map.Entry<String, Integer>> itrMap = map.entrySet().iterator();
//        while (itrMap.hasNext()){
//            Map.Entry<String, Integer> entry = itrMap.next();
//            System.out.println("Processing with iterator - " + entry.getKey());
//            if (entry.getKey().equals("Bob")){
//                itrMap.remove();
//            }
//        }
//        System.out.println("after safe removal" + map);

        Iterator<Map.Entry<String, Integer>> itrMap = map.entrySet().iterator();
        while (itrMap.hasNext()){
            Map.Entry<String, Integer> entry = itrMap.next();
            System.out.println(entry.getKey() +" : "+entry.getValue());
            if (!entry.getKey().equals("Aman")){
                map.put("Aman", 23456);
            }
        }

        System.out.println(map);
    }
}
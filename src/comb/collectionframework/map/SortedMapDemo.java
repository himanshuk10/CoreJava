package comb.collectionframework.map;

/*
    //self balancing binary search tree
 */

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>((a,b) -> b-a);
        sortedMap.put(91, "Aman");
        sortedMap.put(89, "Himanshu");
        sortedMap.put(92, "Raman");
        sortedMap.put(93, "Vivek");
//        sortedMap.put(null, "Vivek");
        System.out.println(sortedMap);
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.keySet());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.entrySet());
        System.out.println(sortedMap.subMap(92,89));

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(2, "Two");
        navigableMap.put(3, "Three");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerEntry(4));
        System.out.println(navigableMap.ceilingKey(0));
        System.out.println(navigableMap.higherEntry(1));

    }
}

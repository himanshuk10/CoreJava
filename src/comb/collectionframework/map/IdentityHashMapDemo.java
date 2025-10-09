package comb.collectionframework.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
/*
    In Java, HashMap and IdentityHashMap are both implementations of the Map interface, but they differ in
     how they compare keys. HashMap uses equals() to compare keys, meaning two objects with the same content
     are considered equal. IdentityHashMap, on the other hand, uses reference equality (==) to compare keys,
     meaning two objects are considered equal only if they are the same object in memory,
     even if they have different content.

    //hashmap me string ka hashcode chalega jiske vajah se same hashcode aayega so replace hoga
    //Identityhashmap me object ka hashcode chalega jo alag alag hoga so replace nahi hoga
 */
public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("Key");
        String key2 = new String("Key");
//        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new IdentityHashMap<>();
        map.put(key1, 1);//key --> 1
        map.put(key2, 2);//key --> 2
        System.out.println(key1.equals(key1));
        System.out.println(map);

    }
}

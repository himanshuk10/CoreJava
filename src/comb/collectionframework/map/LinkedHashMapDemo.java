package comb.collectionframework.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.3f, true);//doubleLinkedList

        linkedHashMap.put("Orange", 11);
        linkedHashMap.put("Apple", 22);
        linkedHashMap.put("Guava", 13);
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Guava");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap<>(hashMap);//Hashmap --> LinkedHashMap

    }
}

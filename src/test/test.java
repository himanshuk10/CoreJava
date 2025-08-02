package test;

import comb.collectionframework.map.GC;

import java.util.*;

public class test {
    public static void main(String[] args){

//        Map<String, String> map = new LinkedHashMap<>();
//        map.put("Himanshu", "Add: Bihar, mob : 7763077990");
//        map.put("Aman","Add: Bihar, mob : 7763077990");
//        for (Map.Entry<String, String> entry : map.entrySet()){
//            System.out.println(entry.getKey());
//        }
        test();
    }
    static void test(){
        Map<String, Integer> map = new HashMap<>();
        map.put("Himanshu", 123);
        map.put("Aman", 234);
        map.put("Anish", 45);
        map.put("Rahul", 1);
        map.put("Pkus", 11);
        System.out.println("usinh hashmap: "+map);

        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("Himanshu", 123);
        map1.put("Aman", 234);
        map1.put("Anish", 45);
        map1.put("Rahul", 1);
        map1.put("Pkus", 11);
        System.out.println("using linked hashmap: "+map1);

        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("Himanshu", 123);
        map2.put("Aman", 234);
        map2.put("Anish", 45);
        map2.put("Rahul", 1);
        map2.put("Pkus", 11);
        System.out.println("using Tree map: "+map2);
    }
}

package comb.collectionframework.map;

import java.util.Hashtable;
import java.util.Map;
/*
    --> All method synchronized --> thread-safe
    --> Slower than HashMap
    --> No null key or value
    --> Legacy Class, ConcurrentHashmap
    --> when our preference is data consistency over performance
 */
public class HashTableDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new Hashtable<>();
        map.put(1, "Apple");
        map.put(2, "Mango");
        map.put(3, "Banana");
        map.put(4, "Potato");
        System.out.println(map);
        System.out.println(map.containsValue(3));


        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });
        Thread thread2 = new Thread(() ->{
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread1");
            }
        });
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(map.size());
    }
}

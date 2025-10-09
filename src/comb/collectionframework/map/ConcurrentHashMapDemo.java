package comb.collectionframework.map;

import java.util.concurrent.ConcurrentHashMap;
/*
    -> java 7 --> segment based locking --> 16 segment --> smaller hashmap
    -> only the segment being written to or read from is locked
    -> read : do not require locking unless there is a write ops happening on the same segment
    -> write : lock
    -> java 8 --> no segmentation
              --> compare-and-swap -> no locking except resizing or collision
        //Thread A last saw : x = 43
        //Thread A work : x to 50
        //if x is still 42 then change it else don't change and retry
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        /*
            -> java 7 --> segment based locking --> 16 segment --> smaller hashmap
            -> only the segment being written to or read from is locked
            -> read : do not require locking unless there is a write ops happening on the same segment
            -> write : lock
            -> java 8 --> no segmentation
              --> compare-and-swap -> no locking except resizing or collision
        //Thread A last saw : x = 43
        //Thread A work : x to 50
        //if x is still 42 then change it else don't change and retry
        */
    }
}

package comb.CoreJavaInterview.generic;

import javax.crypto.Cipher;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
//        Box<String> box = new Box<>();  // Box is now type-safe
//        box.setValue("Hello");  // No issue, it's an String
//        String i = box.getValue();  // No casting needed
//        System.out.println(i);
        Pair<String, Integer> pair = new Pair<>("Aman", 12);
        System.out.println(pair.getKey() +" -> "+pair.getValue());

        Pair<Integer, String> pair2 = new Pair<>(104, "Mombai");
        System.out.println(pair2.getKey() +" -> "+pair2.getValue());;
    }
}

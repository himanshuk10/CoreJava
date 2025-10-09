package comb.CoreJavaInterview.generic.ginterface;
interface Container<T> {
    void add(T item);
    T get();
}
class GenericContainer<T> implements Container<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}

interface Pair<K, V> {
    K getKey();
    V getValue();
}
class KeyValuePair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
interface NumberContainer<T> {
    void add(T item);
    T get();
}
class IntegerContainer implements NumberContainer<Double>{
    private Double item;
    @Override
    public void add(Double item) {
        this.item = item;
    }

    @Override
    public Double get() {
        return item;
    }
}
public class Main {
    public static void main(String[] args) {
        GenericContainer<String> genericContainer = new GenericContainer<>();
        genericContainer.add("Ram");
        System.out.println(genericContainer.get());


        KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>("Highway", 1);
        System.out.println(keyValuePair.getKey() +" -> "+ keyValuePair.getValue());


        IntegerContainer obj = new IntegerContainer();
        obj.add(3.23);
        System.out.println(obj.get());
    }
}

package comb.collectionframework.map;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        WeakReference<Phone> weakReference = new WeakReference<>(new Phone("Apple", "16 pro max"));
        System.out.println(weakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        } catch (Exception ignore) {

        }
        System.out.println(weakReference.get());

    }
}
class Phone{
    String name;
    String model;

    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

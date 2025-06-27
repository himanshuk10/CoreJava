package comb.collectionframework.map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        String key1 = new String("img1");
        String key2 = new String("img1");
        imageCache.put(key1, new Image("Image1"));
        imageCache.put(key2, new Image("Image2"));
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entry may me cleared): "+imageCache);
    }

    private static void simulateApplicationRunning(){
        try {
            System.out.println("Simulating application running....");
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
